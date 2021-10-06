package ru.mirea.test;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Task11Two extends JFrame {
    public static void WorstestTaskEver() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea jta1 = new JTextArea(10,25);
        JButton button = new JButton("Add some Text");
        Font font = new Font("Verdana", Font.PLAIN, 11);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);

        JMenu newMenuShrift = new JMenu("Шрифты");
        newMenuShrift.setFont(font);
        fileMenu.add(newMenuShrift);

        JMenuItem ShriftOne = new JMenuItem("Шрифт 1");
        ShriftOne.setFont(font);
        newMenuShrift.add(ShriftOne);


        JMenuItem ShriftTwo = new JMenuItem("Шрифт 2");
        ShriftTwo.setFont(font);
        newMenuShrift.add(ShriftTwo);

        JMenuItem ShriftThree = new JMenuItem("Шрифт 3");
        ShriftThree.setFont(font);
        newMenuShrift.add(ShriftThree);

        JMenu newMenuColor = new JMenu("цвета");
        newMenuColor.setFont(font);
        fileMenu.add(newMenuColor);

        JMenuItem ColorOne = new JMenuItem("цвет 1");
        ColorOne.setFont(font);
        newMenuColor.add(ColorOne);


        JMenuItem ColorTwo = new JMenuItem("цвет 2");
        ColorTwo.setFont(font);
        newMenuColor.add(ColorTwo);

        JMenuItem ColorThree = new JMenuItem("цвет 3");
        ColorThree.setFont(font);
        newMenuColor.add(ColorThree);
        /*
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setFont(font);
        fileMenu.add(openItem);

        JMenuItem closeItem = new JMenuItem("Close");
        closeItem.setFont(font);
        fileMenu.add(closeItem);

        JMenuItem closeAllItem = new JMenuItem("Close all");
        closeAllItem.setFont(font);
        fileMenu.add(closeAllItem);

        fileMenu.addSeparator();
*/
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                WorstestTaskEver();
            }
        });
    }
}