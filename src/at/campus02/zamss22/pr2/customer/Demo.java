package at.campus02.zamss22.pr2.customer;

public class Demo {
    public static void main(String[] args) {
        Address a1 = new Address("Neue welt 7", "8010", "Graz", "AT");
        Address a2 = new Address("Himmelreichgasse 12", "8043", "Graz", "AT");

        Customer c1 = new Customer(1,"Tara", "keir");
        Customer c2 = new Customer(3, "lara", "macher");

        c1.addAddress(a1);
        c2.addAddress(a2);
        System.out.println(c1);
        System.out.println(c2);
        c1.doSomething();


    }
}
