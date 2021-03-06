package at.campus02.zamss22.pr2.accountuebung;

import java.util.Objects;

public class Account implements Comparable<Account> {
    private static int uniqueID = 1;

    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        accountID = uniqueID++;
        balance = 0.0;
    }

    public double add(double wert) {
        return balance += wert;

    }

    public double deposit(double wert) {
        if (wert > 0) {
            if (wert < balance) {
                balance -= wert;
            } else {
                wert = balance;
                balance = 0;
            }
            return wert;
        }
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban);
    }

    @Override
    public int compareTo(Account o) {
        if (this.accountID < o.accountID){
            return -1;
        }
        if (this.accountID > o.accountID){
            return 1;
        }
        return 0;
        // alternative loesung
        // return INteger.compare(this.accountID, o.accountID);
    }
}
