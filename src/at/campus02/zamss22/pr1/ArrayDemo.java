package at.campus02.zamss22.pr1;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = {10, 5, 8};
        int[] array2 = {21, 4, 15};

        System.out.print("+: ");
        for (int z = 0; z< array1.length; z++){
            System.out.print(array1[z]+   array2[z]);
            System.out.print(",");
        }
        System.out.println("------");
        System.out.print("*:");
        for (int z =0; z< array1.length; z++){
            System.out.print(array1[z] * array2[z]);
            System.out.print(",");

        }


        int[] Array1 = new int[3];
        Array1[0] = 10;
        Array1[1] = 5;
        Array1[2] = 8;

        int[] Array2 = new int[3];
        Array2[0] = 21;
        Array2[1] = 4;
        Array2[2] = 15;
    }
}
