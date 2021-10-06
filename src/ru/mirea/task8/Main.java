package ru.mirea.task8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

    Scanner in = new Scanner(System.in);
    String way = in.nextLine();
    Image img = new ImageIcon(way).getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(700,800);

        Main m = new Main();

        m.setBounds(0,0,700,800);
        fr.add(m);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
