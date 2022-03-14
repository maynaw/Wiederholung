package at.campus02.zamss22.pr1;

public class Matrix {
    public static void main(String[] args) {
        int [][] tabelle = new int[4][3];

        //alle werte sollen auf die zahl 7 gesetzt werden (meine glückszahl)
        for (int zeile = 0; zeile < tabelle.length; ++zeile){
            for (int spalte = 0; spalte < tabelle[zeile].length; ++spalte){
                tabelle[zeile][spalte] = 7;
                System.out.println(tabelle);
                System.out.println(tabelle[zeile]);
                System.out.println(tabelle[zeile][spalte]);
            }
        }
    }

}
