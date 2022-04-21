package at.campus02.zamss22.pr2.maybeUebung;

public class Maybe<T> {
    private T data;
    private int status;
// generische Bersion der klasse - der Typ T wird dann ersetzt durch konkreten Typ
    // nach erzeugung einer Instanz
    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }

    public void print() {
        switch (status) {
            case 1:
                System.out.println("Zugriff gewährt: " + data);
                break;
            case 2:
                System.out.println("Geht dich nichts an!");

                break;
            case 3:
                System.out.println("Bitte Status zwischen 1 und 3 ");

                break;
            default:
                System.out.println("Bitte Status zwischen 1 und 3 ");
        }
    }
}
