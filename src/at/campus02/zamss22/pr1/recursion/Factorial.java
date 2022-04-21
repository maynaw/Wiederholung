package at.campus02.zamss22.pr1.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.print(num + "! = ");
        System.out.println(factorialOfNumber(num));

    }

    public static long factorialOfNumber(int n) {
        if (n > 0) {
            return n * factorialOfNumber(n - 1);
        } else
            return 1;
    }

}