package mini.grafika;

public class Punkt3d extends Punkt {

    private int z;

    public Punkt3d(){
    }

    public Punkt3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3d(Punkt3d p) {
        super(p);
        this.z = p.z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void wyswietlwspolrzedne() {
        super.wyswietlwspolrzedne();
        System.out.println("Wsp. z = " + z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
