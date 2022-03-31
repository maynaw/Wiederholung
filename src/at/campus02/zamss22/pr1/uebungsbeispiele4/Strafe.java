package at.campus02.zamss22.pr1.uebungsbeispiele4;

public class Strafe {
    /*  public static void main(String[] args) {
          System.out.println("fügen die Vorname des Fahrers ein");
          java.util.Scanner sca = new java.util.Scanner(System.in);
          String vorname = sca.nextLine();
          System.out.println("Vorname: " + vorname);

          System.out.println("fügen die Nachname des Fahrers ein");
          java.util.Scanner scan = new java.util.Scanner(System.in);
          String nachname = sca.nextLine();
          System.out.println("Nachname: " + nachname);

          System.out.println("fügen die PKW-Kennzeichen des PKW ein");
          java.util.Scanner scanner = new java.util.Scanner(System.in);
          String PKW = sca.nextLine();
          System.out.println("PKW-Kennzeichen: " + PKW);

          System.out.println("fügen der strafnummer ein");
          java.util.Scanner scanner1 = new java.util.Scanner(System.in);
          int num = sca.nextInt();
          System.out.println("strafnummer: " + num);

          System.out.println("fügen der Strafe ein");
          java.util.Scanner scanner2 = new java.util.Scanner(System.in);
          double strafe = sca.nextDouble();
          System.out.println("Strafe: " + strafe);

          int anzahl = 0;
          if (strafe != 0){
              anzahl = anzahl +1;
              System.out.println("Strafen Anzahl ist:" + anzahl);
          }
     */
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;

    public void strafe(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung <= 20 && geschwindigkeitsueberschreitung > 0) {
            strafe = 30;
        } else if (geschwindigkeitsueberschreitung <= 30) {
            strafe = 50;
        } else if (geschwindigkeitsueberschreitung <= 50) {
            strafe = 100;
        } else if (geschwindigkeitsueberschreitung <= 100) {
            strafe = 500;
        } else {
            strafe = 1500;
        }
        anzahl = anzahl + 1;
    }

    public void verbandspaket() {
        strafe = strafe + 25;
        anzahl = anzahl + 1;
    }

    public void alkohol(double wert) {
        if (wert >= 3) {
            strafe = 5000;
        } else if (wert >= 2) {
            strafe = 1000;
        } else if (wert >= 1) {
            strafe = 400;
        }else if (wert>=0.5){
            strafe = 100;
        }
        anzahl = anzahl +2;
    }
    public void sonstiges(double wert){
    strafe = strafe + wert;
    anzahl = anzahl +1;
    }
    public double getStrafe(){
        if (anzahl== 1){
            return strafe = strafe-(strafe*0.3);
        }else if (anzahl == 2){
            return strafe = strafe- (strafe * 0.2);
        }else if (anzahl == 3){
            return strafe = strafe - (strafe * 0.1);
        }else if (anzahl == 4){
            return strafe;
        }else {
            return 0;
        }
    }
}