package at.campus02.zamss22.pr2.customer;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doSomething(){
        System.out.println(firstName +" "+ lastName + " eats chocolate");
    }
}
