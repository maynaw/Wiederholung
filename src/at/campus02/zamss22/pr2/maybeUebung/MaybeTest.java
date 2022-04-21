package at.campus02.zamss22.pr2.maybeUebung;

import at.campus02.zamss22.pr2.accountuebung.Account;

public class MaybeTest {
    public static void main(String[] args) {
        Maybe<Double> gehalt = new Maybe<>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura","AT590735", "RIDITG"),1);
        meinKonto.print();
    }
}
