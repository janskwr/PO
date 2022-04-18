package pw.mini.elektronika;

import java.util.Random;
import java.time.LocalDate;

public abstract class UrzadzenieRTV implements Odbieranie {

    // WLASCIWOSCI OBIEKTU
    LocalDate dataProdukcji;
    String nazwa = generujNazwe(5);
    int iloscWlaczen = randomNumberGeneratorInRange(3, 7);
    boolean wlaczone;

    // KONSTRUKTORY
    public UrzadzenieRTV(){
    }

    public UrzadzenieRTV(LocalDate dataProdukcji, int iloscWlaczen, boolean wlaczone){
        this.dataProdukcji = dataProdukcji;
        this.iloscWlaczen = iloscWlaczen;
        this.wlaczone = wlaczone;
    }


    // GETTERY I SETTERY
    public int getIloscWlaczen() {
        return iloscWlaczen;
    }

    public void setIloscWlaczen(int iloscWlaczen) {
        this.iloscWlaczen = iloscWlaczen;
    }


    // METODY
    /**
     * Generuje losową nazwę o podanej ilości znaków
     * @param iloscZnakow długość generowanej nazwy
     * @return String z losową nazwą
     */
    private String generujNazwe(int iloscZnakow){
        String litery = "ABCDEFGHIJKLMNOPQRSTUWYXZ";
        StringBuilder nazwa = new StringBuilder("");
        Random rand = new Random();
        for (int i = 0; i < iloscZnakow; i++) {
            nazwa.append(litery.charAt(rand.nextInt(litery.length())));
        }
        return nazwa.toString();
    }

    public int randomNumberGeneratorInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void odbieram() {
    }

    @Override
    public String toString() {
        return "Data produkcji: " + dataProdukcji + ", nazwa: " + nazwa + ", ilosc wlaczen: " + iloscWlaczen + ", wlaczone: " + wlaczone + ".\n";
    }
}
