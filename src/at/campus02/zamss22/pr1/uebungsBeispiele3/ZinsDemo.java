package at.campus02.zamss22.pr1.uebungsBeispiele3;

public class ZinsDemo {
    public static void main(String[] args) {
        zinsenRechnen(1000, 2.25);
    }
    public static void zinsenRechnen(double kontoStand, double zinsen){
        double erhaltenenZinsen = kontoStand * zinsen / 100;
        System.out.println("erhaltenen Zinsen ist: " + erhaltenenZinsen);
    }
}
