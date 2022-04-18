import mini.grafika.Punkt;
import mini.grafika.Punkt3d;

public class TestPunktow {

    public static void main(String[] args) {

        int a;
        a = 5;

        System.out.println("a = " + a);

        Punkt p1;
        p1 = new Punkt();

        System.out.println(p1);
//        System.out.println("wsp x = " + p1.x);
//        System.out.println("wsp y = " + p1.y);

        Punkt p2 = new Punkt();
        System.out.println("wsp x = " + p2.getX());
        System.out.println("wsp y = " + p2.getY());
//        p2.x = 7;
//        p2.y = 9;
        p2.setX(7);
        p2.setY(9);
//        System.out.println("wsp x = " + p2.x);
//        System.out.println("wsp y = " + p2.y);
        p2.wyswietlwspolrzedne();

        Punkt p3 = new Punkt(3, 10);
        p3.wyswietlwspolrzedne();

        Punkt p5 = new Punkt(p2);
        p5.wyswietlwspolrzedne();

        Punkt3d p4 = new Punkt3d();
        p4.wyswietlwspolrzedne();

        Punkt3d p6 = new Punkt3d(2, 4, 7);
        p6.wyswietlwspolrzedne();

        Punkt3d p7 = new Punkt3d(p6);
        System.out.println("\np7:");
        p7.wyswietlwspolrzedne();
        System.out.println("Wsp. z = " + p7.getZ());

        Punkt p8 = p7;
        p8.wyswietlwspolrzedne();
        Punkt3d p9 = (Punkt3d) p8;
        p9.wyswietlwspolrzedne();
        System.out.println("p9: " + p9);
    }

}
