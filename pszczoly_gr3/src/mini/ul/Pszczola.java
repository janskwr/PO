package mini.ul;

import java.util.Random;

public class Pszczola implements Runnable {
    private int honey;
    private Symulacja symulacja;

    public Pszczola(Symulacja symulacja) {
        this.symulacja = symulacja;
    }

    public void collectHoney() {
        honey++;
    }

    public int giveHoney() {
        int tmp = honey;
        honey = 0;
        return tmp;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int gather = rand.nextInt(15) + 5;
        while (true) {
            try {
                collectHoney();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
            if (honey == gather) {
                symulacja.setHoney(symulacja.getHoney() + giveHoney());
            }
        }
    }
}
