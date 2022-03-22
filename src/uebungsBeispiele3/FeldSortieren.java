package uebungsBeispiele3;

public class FeldSortieren {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 9, 2, 8, 1};
        arrangeOrder(numbers);
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i<numbers.length-1) {
                System.out.print(", ");
            }
        }

    }

    public static void arrangeOrder(int[] numbers) {
        boolean vertauschung;
        do {
            vertauschung = false;
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int swap = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = swap;

                    vertauschung = true;
                }
                //
            }
        }while (vertauschung);
    }
}