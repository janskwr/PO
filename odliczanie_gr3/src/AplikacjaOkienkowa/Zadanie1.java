package AplikacjaOkienkowa;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JPanel implements ChangeListener, ActionListener {

    int licznik_odliczen = 1;
    int time = 10;

    public Zadanie1(){

        // Tworzymy przycisk
        JButton button = new JButton("Count");
        button.addActionListener(this);


        // Tworzymy suwaczek
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        slider.addChangeListener(this);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Towrzymy etykietę
        JLabel label = new JLabel();
        label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Title1"), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        // liczniki
        JPanel panel = new JPanel();

        panel.add(button);
        panel.add(slider);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Title1"), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        add(label);
        add(panel, BorderLayout.LINE_START);

    }


    public static void showGUI (String title){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.add(new Zadanie1());
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        licznik_odliczen++;
        if (licznik_odliczen < 5) {
            showGUI("Zadania zaliczeniowe");
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    public static void main(String[] args) {
        showGUI("Zadanie zaliczeniowe");
    }
}
