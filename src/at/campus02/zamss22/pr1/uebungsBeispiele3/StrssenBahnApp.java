package at.campus02.zamss22.pr1.uebungsBeispiele3;

public class StrssenBahnApp {
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("enter the station number from 1 to 6 ");
        int stationNumber = s.nextInt();
        int bleibendeZeit;
        switch (stationNumber) {
            case 1:
                bleibendeZeit = 20;
                break;
            case 2:
                bleibendeZeit = 16;
                break;
            case 3:
                bleibendeZeit = 15;
                break;
            case 4:
                bleibendeZeit = 10;
                break;
            case 5:
                bleibendeZeit = 3;
                break;
            default:
                bleibendeZeit = 0;
                System.out.println("Sie sind in Zielstation. Steigen Sie aus");
                break;


        }

        System.out.println("Bis Ihre Zielstation bleibt " + bleibendeZeit + " Minuten");

/*
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("enter the station number from 1 to 6 ");
        int stationNumber = s.nextInt();
        int bleibendeZeit;
        java.util.TimeZone dt = new java.util.TimeZone();
        switch (stationNumber) {
            case 1:
                bleibendeZeit = 20;
                break;
            case 2:
                bleibendeZeit = 16;
                break;
            case 3:
                bleibendeZeit = 15;
                break;
            case 4:
                bleibendeZeit = 10;
                break;
            case 5:
                bleibendeZeit = 3;
                break;
            default:
                bleibendeZeit = 0;
                System.out.println("Sie sind in Zielstation. Steigen Sie aus");
                break;
        }
        java.util.Timer  zeit = new java.util.Timer(bleibendeZeit);
        System.out.println(erreichZeit);
        System.out.println("Bis Ihre Zielstation bleibt " + bleibendeZeit + " Minuten");
*/
    }

}
