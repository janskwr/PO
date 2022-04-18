package mini.samoloty;

import mini.obsluga.Pojazd;
import mini.obsluga.WyjatekBrakuPaliwa;
import mini.obsluga.WyjatekTransportu;

public class Samolot {

    protected int iloscPaliwa;
    protected int iloscZalogi;
    private String miejsceOdlotu;
    private int[] czasPrzylotu;

    public Samolot() {
    }

    @Override
    public String toString() {
        return "Czas przylotu " + czasPrzylotu[0] + ":" + czasPrzylotu[0] +
                ". Zostało mu " + iloscPaliwa + " litrów paliwa";
    }

    public void getIloscPaliwa() throws WyjatekBrakuPaliwa {
        if (getIloscPaliwagetter() <= 50){
            throw new WyjatekBrakuPaliwa("Mało paliwa!");
        }
    }

    public Samolot (int iloscPaliwa, int iloscZalogi, String miejsceOdlotu, int[] czasPrzylotu) throws WyjatekBrakuPaliwa, WyjatekTransportu{
        this.iloscPaliwa = iloscPaliwa;
        this.iloscZalogi = iloscZalogi;
        this.miejsceOdlotu = miejsceOdlotu;
        this.czasPrzylotu = czasPrzylotu;
        if (iloscPaliwa < 200) {
            throw new WyjatekBrakuPaliwa("Mamy wyciek paliwa, bez paniki proszę");
        }
        if (iloscZalogi < 2) {
            throw new WyjatekTransportu("Mamy wyciek paliwa, bez paniki proszę");
        }
    }

    // GETTERY I SETTERY

    public int getIloscPaliwagetter() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(int iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public int getIloscZalogi() {
        return iloscZalogi;
    }

    public void setIloscZalogi(int iloscZalogi) {
        this.iloscZalogi = iloscZalogi;
    }

    public String getMiejsceOdlotu() {
        return miejsceOdlotu;
    }

    public void setMiejsceOdlotu(String miejsceOdlotu) {
        this.miejsceOdlotu = miejsceOdlotu;
    }

    public int[] getCzasPrzylotu() {
        return czasPrzylotu;
    }

    public void setCzasPrzylotu(int[] czasPrzylotu) {
        this.czasPrzylotu = czasPrzylotu;
    }
}
