package pw.mini.elektronika;

public class TelewizorPlaski extends Telewizor implements OdbieranieRozszerzone{

    matrice matryca;

    @Override
    public void odbierzSygnal() {
    }


    public enum matrice {
        LCD, LED, PLAZMA;
    }
}
