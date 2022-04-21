package at.campus02.zamss22.pr2.accountuebung;

import at.campus02.zamss22.pr2.accountuebung.Account;

import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {
        //     public Acount(String owner, String iban, String bic) {
        Account acount1 = new Account("Dagobert", "AT8459034", "RY85023");
        Account acount2 = new Account("Daisy", "AT85r48", "RY89579734");
        Account acount3 = new Account("Donald", "AT580345", "RY3409285");
        acount1.add(250);
        acount1.deposit(150);
        acount2.add(150);
        acount2.deposit(100);
        acount3.add(100);
        acount3.deposit(50);
        Account[] accounts = new Account[]{acount1, acount2, acount3};
        for (Account account : accounts) {
            // for (int i = 0; i<3; i++){
//            System.out.println(arr[i].getBalance());
            System.out.println(account.getBalance());
        }
        System.out.println(acount3.deposit(10));
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getBalance());
        }
      /*  acount1.getAccountID() = 2957832;
        acount2.getAccountID() = 579837;
        acount3.getAccountID() = 853045;
        Account[] accountID = new Account[]{acount1, acount2, acount3};
     //   for (Account ac)
        System.out.println(accountID.g);

       */
        System.out.println(acount3.deposit(1000));
        //  for (int i = 0; )
        // wir möchten die accounts über den namen der bewtitzer*innen zugreifen
        // mapping von Dagobert Duck --> Account(.....)
        // Dagobert Duck ist ein Beispiel für ein Schlüsselelement -> String
        // Account (...) ist ein Beispiel für einen Wert -> Accont()
        //Account : wenn wir das so machen kann jede person maximal nur einen account haben
        HashMap<String, Account> bank = new HashMap<>();

        bank.put("Dagobert", acount1);
        bank.put("Daisy", acount2);
        bank.put("Donald", acount3);

// gibt es einen wert hinter dem schlüssel dagobert?
        System.out.println(bank.containsKey("Dagobert"));
        // möchten den wert des schlüssel daisy erhalten (also ihr konto)
        System.out.println(bank.get("Daisy"));
        // einmal drüber iterieren -> achtung etwas anders
        for (String owner : bank.keySet()) {
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }

    }
}
