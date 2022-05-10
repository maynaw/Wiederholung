package at.campus02.zamss22.pr2.neuSortieren;

public class Mitarbeiter implements Comparable<Mitarbeiter> {
    private String vname;
    private String zname;
    private int geburtsJahr;

    public Mitarbeiter(String vname, String zname, int geburtsJahr) {
        this.vname = vname;
        this.zname = zname;
        this.geburtsJahr = geburtsJahr;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public int getGeburtsJahr() {
        return geburtsJahr;
    }

    public void setGeburtsJahr(int geburtsJahr) {
        this.geburtsJahr = geburtsJahr;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vname='" + vname + '\'' +
                ", zname='" + zname + '\'' +
                ", geburtsJahr=" + geburtsJahr +
                '}';
    }

    // i want to sort it the following way
    // by the birth year starting with the youngest person
    @Override
    public int compareTo(Mitarbeiter o) {
        if (this.geburtsJahr > o.geburtsJahr) {
            return -1;
        }
        if (this.geburtsJahr < o.geburtsJahr){
            return 1;
        }
        return 0;
    }
}
