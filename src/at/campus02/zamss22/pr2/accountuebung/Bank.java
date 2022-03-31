package at.campus02.zamss22.pr2.accountuebung;

import at.campus02.zamss22.pr2.accountuebung.Account;

public class Bank {
    public static void main(String[] args) {
        //     public Acount(String owner, String iban, String bic) {
        Account acount1 = new Account("maya", "AT8459034", "RY85023");
        Account acount2 = new Account("Tala", "AT85r48", "RY89579734");
        Account acount3 = new Account("rama", "AT580345", "RY3409285");
        acount1.add(250);
        acount1.deposit(150);
        acount2.add(150);
        acount2.deposit(100);
        acount3.add(100);
        acount3.deposit(50);
        Account[] accounts = new Account[]{acount1, acount2, acount3};
        for (Account account : accounts){
        // for (int i = 0; i<3; i++){
//            System.out.println(arr[i].getBalance());
            System.out.println(account.getBalance());
        }
        System.out.println(acount3.deposit(10));
        for (int i = 0; i<accounts.length; i++){
            System.out.println(accounts[i].getBalance());
        }
    }
}
