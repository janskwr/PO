package mini.samoloty;

import mini.obsluga.WyjatekBiznesowy;
import mini.obsluga.WyjatekBrakuPaliwa;
import mini.obsluga.WyjatekTransportu;

public class SamolotPasazerski extends Samolot{

    private int maxIloscMiejsc;
    private int liczbaPasazerow;

    public SamolotPasazerski(int iloscPaliwa, int iloscZalogi, String miejsceOdlotu, int[] czasPrzylotu) throws WyjatekBrakuPaliwa, WyjatekTransportu {
        super(iloscPaliwa, iloscZalogi, miejsceOdlotu, czasPrzylotu);
    }

    @Override
    public String toString() {
        if(iloscPaliwa > 0) {
            String s = super.toString();
            return s + "Jest to samolot pasażerski, gdzie zajęto " +
                    liczbaPasazerow + " miejsc z " + maxIloscMiejsc +
                    ". Załoga składa się z " + iloscZalogi + " osób";
        }
        return "Samolot zniknął z radarów...";
    }


    public SamolotPasazerski (int maxIloscMiejsc, int liczbaPasazerow) throws WyjatekBiznesowy{
        super();
        this.maxIloscMiejsc = maxIloscMiejsc;
        this.liczbaPasazerow = liczbaPasazerow;
        if (liczbaPasazerow < maxIloscMiejsc/2) {
            throw new WyjatekBiznesowy("Mniej pasażerów od połowy dostępnych miejsc");
        }
    }

    public int getMaxIloscMiejsc() {
        return maxIloscMiejsc;
    }

    public void setMaxIloscMiejsc(int maxIloscMiejsc) {
        this.maxIloscMiejsc = maxIloscMiejsc;
    }

    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    public void setLiczbaPasazerow(int liczbaPasazerow) {
        this.liczbaPasazerow = liczbaPasazerow;
    }
}
