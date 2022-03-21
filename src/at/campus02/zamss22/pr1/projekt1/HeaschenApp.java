package at.campus02.zamss22.pr1.projekt1;

// import at.campus02.zamss22.pr1.projekt1.Haeschen;

public class HeaschenApp {
    public static void main(String[] args) {
        // statisches Attribut bzw. Methode kann auch ohne über Instanz verwendet werden
        // mit dem Namen der klasse!!!!
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
        // Zugriff auf Attribut mittels Objekt- bzw. Instanznamen
        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);
        Haeschen bugs = null;//nur um zu zeigen, dass auch erst spaeter die instanz erzeugt werden kann
        // irgendwann spaeter
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";
        // was geht noch aber ist unueblich
        // wir testen unser hoppel methode - ohne haeschen geht nix
        // Haeschen ........ get nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");
        //Aufruf statische Methode



    }
}
