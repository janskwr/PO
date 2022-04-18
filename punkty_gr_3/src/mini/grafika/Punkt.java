package mini.grafika;

/**
 * Klasa opisująca punkty na płaszczyźnie
 * w kartezjańskim układzie współrzędnych
 * JAN SKWAREK
 */
public class Punkt {

//     Pola - właściwości obiektu
    protected int x;
    protected int y;
//     Konstruktory
    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt p) {
        this.x = p.x;
        this.y = p.y;
    }

//     Metody - funkcjonalność
    public void wyswietlwspolrzedne() {
        System.out.println("Wsp. x = " + x);
        System.out.println("Wsp. y = " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
