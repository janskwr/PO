package mini.lotnisko;

import mini.obsluga.WyjatekBiznesowy;
import mini.obsluga.WyjatekBrakuPaliwa;
import mini.obsluga.WyjatekTransportu;
import mini.samoloty.Samolot;
import mini.samoloty.SamolotPasazerski;

import java.util.*;

public class KomputerKontrolny {
    public static void main(String[] args) {

        //pkt. 1
        String miasta[] = {"Warszawa", "Gdańsk", "Kraków", "Wrocław", "Modlin"};
        Random rand = new Random();

        //todo
        Map<Integer, SamolotPasazerski> samolotyID = new HashMap<Integer, SamolotPasazerski>();
        Samolot[] samoloty;
        Samolot samolot1 = new Samolot(rand.nextInt(500), rand.nextInt(10),);
        Samolot samolot2 = new Samolot();
        Samolot samolot3 = new Samolot();
        Samolot samolot4 = new Samolot();
        Samolot samolot5 = new Samolot();
        Samolot samolot6 = new Samolot();
        Samolot samolot7 = new Samolot();
        Samolot samolot8 = new Samolot();
        Samolot samolot9 = new Samolot();
        Samolot samolot10 = new Samolot();
        samoloty = new Samolot[]{samolot1, samolot2, samolot3, samolot4, samolot5, samolot6, samolot7, samolot8, samolot9, samolot10};
        //pkt. 2 i 3

        System.out.println("------PRZYGOTOWANIE SAMOLOTÓW----------");
        //todo
        for (int i: samolotyID.keySet()) {
            samolotyID.put(i, (SamolotPasazerski) samoloty[i]);
        }

        //pkt. 4 i 5


        System.out.println("------SAMOLOTY W POWIETRZU----------");
        //todo
        //pkt 6


    }
}
