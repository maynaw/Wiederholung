package at.campus02.zamss22.pr1;

public class HerunterZählen {
    public static void main(String[] args) {
        herunterZählen(99, 0);
    }

    public static void herunterZählen(int val, int stop) {
        System.out.println(val);
        if (val > 0 && val > stop) {
            herunterZählen(val -1, stop);
        }

    }
}
