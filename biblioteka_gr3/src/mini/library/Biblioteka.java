package mini.library;

import java.io.*;
import javax.swing.*;
import java.util.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biblioteka {

    public Biblioteka(){

        JLabel label = new JLabel();
        label.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Title1"), BorderFactory.createEmptyBorder(10, 10, 10, 10)));

    }


    public Biblioteka(StreamTokenizer strumien) throws IOException {
        String nazwa;
        String autor;
        int data;
        while(strumien.nextToken() != StreamTokenizer.TT_EOF){
            nazwa = strumien.sval;
            strumien.nextToken();
            autor = strumien.sval;
            strumien.nextToken();
            data = (int) strumien.nval;
            System.out.println(nazwa + autor + data);
        }
    }

    public static void showGUI (String title){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.add(new Biblioteka());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showGUI("Zadanie zaliczeniowe");
    }

}
