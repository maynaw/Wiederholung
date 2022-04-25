package at.campus02.zamss22.pr2.customer;

import java.util.ArrayList;

public class Customer extends Person{
    private int customerNumber;
    private ArrayList<Address> addresses;
    //private ArrayList<Address> addresses = new ArrayList<>();



    public Customer(int customerNumber,String firstName, String lastName) {
        super(firstName, lastName); // muss in erste line sein sonst falsch
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public void doSomething() {
        super.doSomething();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses + "person: " + lastName +
                '}';
    }
}
