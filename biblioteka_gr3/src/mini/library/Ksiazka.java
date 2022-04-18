package mini.library;

public class Ksiazka {

    private String autor;
    private String tytul;
    private int rok;
    private boolean wypozyczona = false;

    public Ksiazka(String autor, String tytul, int rok, boolean wypozyczona){
        this.autor = autor;
        this.tytul = tytul;
        this.rok = rok;
        this.wypozyczona = wypozyczona;
    }


}
