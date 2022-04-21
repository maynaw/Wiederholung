package at.campus02.zamss22.pr2;

import at.campus02.zamss22.pr2.accountuebung.Account;
import at.campus02.zamss22.pr2.osterhase.Osterhase;

import java.util.HashSet;

public class HashProblems {
    public static void main(String[] args) {
        // zeigen, dass theoretisch unterschiedliche objekte gleichen hashcode haben können
        String s1= "VII";
        String s2 = "Ugh";
        Osterhase marla = new Osterhase("marla");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Account acount1 = new Account("maya", "AT8459034", "RY85023");
        Account acount2 = new Account("maya2", "AT8459034", "RY85023");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(marla.hashCode());

        //erzeugen eine menge (im mathematischen sinne)
        // warum eine menge ? weil diese hat die spezielle eigenschaft
        //dass jedes objekt nur einmal darain sein darf
        // wiie entscheid ob ich es schon drinnen ist oder nicht?
        // die collection verwendet intern dafür  hashCode (
        HashSet<Account> bank; // = new HashSet<Account>();
        Account a3;
    }
}
