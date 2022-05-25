package at.campus02.zamss22.pr2.accountuebung;

import java.util.Comparator;

public class AccountBalanceComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        if (o1.getBalance() < o2.getBalance()){
            return -1;
        }
        if (o1.getBalance() > o2.getBalance()){
            return 1;
        }
        return 0;
    }
}
