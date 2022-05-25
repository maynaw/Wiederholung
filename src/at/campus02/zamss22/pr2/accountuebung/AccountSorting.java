package at.campus02.zamss22.pr2.accountuebung;

import java.util.ArrayList;
import java.util.Collections;

public class AccountSorting {
    public static void main(String[] args) {
        //     public Acount(String owner, String iban, String bic) {
        Account acount1 = new Account("Dagobert", "AT8459034", "RY85023");
        Account acount2 = new Account("Daisy", "AT85r48", "RY89579734");
        Account acount3 = new Account("Donald", "AT580345", "RY3409285");

        acount1.add(1000);
        acount2.add(400);
        acount3.add(200);

        ArrayList<Account> allAccounts = new ArrayList<>();
        allAccounts.add(acount1);
        allAccounts.add(acount2);
        allAccounts.add(acount3);

        System.out.println(allAccounts);

        Collections.sort(allAccounts, new AccountBalanceComparator());
        System.out.println(allAccounts);

        Collections.sort(allAccounts);
        System.out.println(allAccounts);

    }
}
