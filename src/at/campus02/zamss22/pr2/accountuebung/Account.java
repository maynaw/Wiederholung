package at.campus02.zamss22.pr2.accountuebung;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
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
}
