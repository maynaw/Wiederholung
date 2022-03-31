package at.campus02.zamss22.pr1.uebungsBeispiele3;

public class FizzBuzzB1 {
    public static void main(String[] args) {
        richtigenStringZurückgibt(5);
        richtigenStringZurückgibt(77);
        richtigenStringZurückgibt(98);
    }

    public static void richtigenStringZurückgibt(int i) {
        if (i % 3 == 0 && i % 5 != 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0 && i % 3 != 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(i);
        }

    }
}