package at.campus02.zamss22.pr1.arrayUebungen;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
        System.out.println(average(arr));


    }
    public static int sum(int[] num){
        int sum = 0;
        for (int i = 0; i< num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }
    public static double average(int[] number){
        double av = 0;
        int summe = 0;
        for (int i = 0; i< number.length; i++){
            summe = sum(number);
            av = summe / i;
        }
        return av;
    }
}
