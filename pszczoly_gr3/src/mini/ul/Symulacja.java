package mini.ul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

public class Symulacja extends JPanel implements Serializable, ActionListener, WindowListener {

    private JTextField num;
    private int beesNum;
    private JPanel[] pola = new JPanel[10];
    private int honey;
    private Thread[] threads;

    public Symulacja() {

        honey = 0;
        setLayout(new BorderLayout());

        JPanel kontrol = new JPanel();
        JButton start = new JButton("Start");
        start.addActionListener(this);
        start.setActionCommand("Start");

        JButton load = new JButton("Wczytaj");
        load.setActionCommand("Load");
        num = new JTextField(10);
        num.addActionListener(this);

        kontrol.add(start);
        kontrol.add(load);
        kontrol.add(num);


        JPanel ule = new JPanel();
        for (int i = 0; i < 10; i++) {
            pola[i] = new JPanel();
            pola[i].setPreferredSize(new Dimension(20,20));
            pola[i].setBackground(Color.white);
            ule.add(pola[i]);
        }

        add(ule);


        add(kontrol, BorderLayout.NORTH);
    }

    public void setHoney(int honey) {
        this.honey = honey;
        if (honey >= 1000) {
            for (int i = 0; i < beesNum; i++) {
                threads[i].interrupt();
            }
        }
        for (int i = 0; i < honey/100; i++) {
            pola[i].setBackground(Color.yellow);
        }
    }

    public int getHoney() {
        return honey;
    }

    public static void GUI() {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setTitle("Pszczoly");

        Symulacja sym = new Symulacja();

        frame.addWindowListener(sym);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(sym);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aa");
        if (e.getSource() == num) {
            try {
                int beesNumTmp = Integer.parseInt(num.getText());
                if (beesNumTmp > 5 && beesNumTmp < 20) beesNum = beesNumTmp;
                else JOptionPane.showMessageDialog(this,"Niepoprawne dane");
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this,"Niepoprawne dane");
            }
        }
        else if (e.getActionCommand().equals("Start") && beesNum > 5 && beesNum < 20) {
            threads = new Thread[beesNum];
            for (int i = 0; i < beesNum; i++) {
                threads[i] = new Thread(new Pszczola(this));
                threads[i].start();
            }
        }
        else if (e.getActionCommand().equals("Load")) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ul.out"));
                 honey = (Integer) ois.readObject();
                 this.setHoney(honey);
                 ois.close();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GUI();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        for (int i = 0; i < beesNum; i++) {
            threads[i].interrupt();
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ul.out"));
            oos.writeObject(honey);
            oos.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
