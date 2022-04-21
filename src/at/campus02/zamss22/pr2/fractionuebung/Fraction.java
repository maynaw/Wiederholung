package at.campus02.zamss22.pr2.fractionuebung;

public class Fraction {
    private static int nrFractiions =0;
   private int zaehler;
    private int nenner;

    public Fraction(int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
        ++nrFractiions;
        //nrFractiions = nrFractions +1;
    }

    @Override
    public String toString() {
        return zaehler + " /"+ nenner;

    }

    public static int getNrFractiions(){
        return nrFractiions;


    }
    public int getZaehler(){
        return zaehler;
    }
    public int getNenner(){
        return nenner;
    }
    public double toDecimal(){
        return ((double) zaehler / (double) nenner);
    }
    public void print(){
        System.out.println(zaehler + "/" + nenner);

    }
    public Fraction multiplicate(Fraction b2){
        Fraction neuerFraction = new Fraction(zaehler,nenner);
       // neuerFraction.zaehler *= b2.zaehler;
        // neuerFraction.nenner *= b2.nenner;
        neuerFraction.zaehler = neuerFraction.zaehler * b2.zaehler;
        neuerFraction.nenner = neuerFraction.nenner * b2.nenner;
        return neuerFraction;
    }

}
