package pw.mini.elektronika;

public class Radio extends UrzadzenieRTV implements Udzwiekowienie {

    czestotliwosc czestotliwoscValue;


    @Override
    public void wlaczDzwiek() {

    }

    @Override
    public void wylaczDzwiek() {

    }

    public enum czestotliwosc {
        DLUGIE, SREDNIE, KROTKIE, UTH;
    }


    public interface Udzwiekowienie {
        void udzwiekowienie();
    }


}
