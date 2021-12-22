package ru.mirea.Task14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;

public class Task14 extends JFrame {
    JLabel lbl = new JLabel("начните игру");
    JTextField jta = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JButton button = new JButton("Сделать ход");
    int First_player;
    int Second_player;
    int a=0;
    int b=0;
    Task14(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,300);
        add(lbl,BorderLayout.NORTH);
        add(jta);
        add(jta2);
        add(button);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        jta2.setForeground(Color.BLACK);
        jta2.setFont(fnt);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    a=0;
                    Stack <Double> f = new Stack<>();
                    Stack <Double> s = new Stack<>();
                    First_player = Integer.parseInt(jta.getText().trim());
                    Second_player = Integer.parseInt(jta2.getText().trim());
                    for (int i=0; i<5; i++){
                        f.push(First_player%(Math.pow(10, 4-i))/(Math.pow(10, i)));
                        s.push(Second_player%(Math.pow(10, 4-i))/(Math.pow(10, i)));
                        //if ((first<second)||((second==0)&&(first==9))) a++;
                    }
                    for (int i=0; i<5; i++) {
                        double first = f.pop();
                        double second = s.pop();
                        if (((first<second)||((second==0)&&(first==9)))&&(!((second==9)&&(first==0)))) a++;
                    }
                    /*First_player = Double.parseDouble(jta.getText().trim());
                    Second_player = Double.parseDouble(jta2.getText().trim());
                    double[]first = new double[5];
                    first[0]=First_player%10000;
                    first[1]=First_player%1000 / 10;
                    first[2]=First_player%100 / 100;
                    first[3]=First_player%10 / 1000;
                    first[4]=First_player/10000;
                    double[]second = new double[5];
                    second[0]=Second_player%10000;
                    second[1]=Second_player%1000 / 10;
                    second[2]=Second_player%100 / 100;
                    second[3]=Second_player%10 / 1000;
                    second[4]=Second_player/10000;

                    for(int i=0; i<5; i++){
                        if ((first[i]<second[i])||((second[i]==0)&&(first[i]==9))) a++;
                    }*/
                    if (a>2) lbl.setText("Победил 2 игрок");
                    else lbl.setText("Победил 1 игрок");
                    b++;
                    if (b==106) JOptionPane.showMessageDialog(null, "botva","alert" , JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error inNumbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args) {
        new Task14();
    }
}
