package pw.mini.elektronika;

public class Telewizor extends UrzadzenieRTV implements Udzwiekowienie, Obrazowanie{

    int[] przekatna;
    rodzajsygnalu rodzajSygnalu;
    int odbieranyKanal;

    @Override
    public void wlaczDzwiek() {

    }

    @Override
    public void wylaczDzwiek() {

    }

    @Override
    public void wlaczObraz() {

    }

    @Override
    public void wylaczObraz() {

    }


    public enum rodzajsygnalu {
        ANALOGOWY, CYFROWY;
    }



    @Override
    public String toString() {
        super.toString();
        return ("Przekatna: " + przekatna + ", rodzaj sygnalu: " + rodzajSygnalu + ", odbierany kanal: " + odbieranyKanal + ".\n");
    }
}
