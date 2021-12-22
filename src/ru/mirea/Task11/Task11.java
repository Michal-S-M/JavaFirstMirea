package ru.mirea.Task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Task11 extends JFrame
{
    static double rightAnswer=12;
    static int nomberOfFalseAnswer=0;
    JLabel lbl = new JLabel("у вас есть лишь 3 попытки");
    JTextField jta1 = new JTextField(10);
    JButton button = new JButton("Ввод ответа");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Task11()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(350,200);
        add(new JLabel("угадайте число от 1 до 20: "));
        add(jta1);
        add(lbl,BorderLayout.NORTH);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    double userAnswer = Double.parseDouble(jta1.getText().trim());
                    if (userAnswer==rightAnswer)
                        JOptionPane.showMessageDialog(null, "Правильно ","Alert",JOptionPane.INFORMATION_MESSAGE);
                    else {
                        nomberOfFalseAnswer=nomberOfFalseAnswer+1;
                        lbl.setText("осталось попыток: "+(3-nomberOfFalseAnswer));
                        if (nomberOfFalseAnswer>=3) {
                            JOptionPane.showMessageDialog(null, "Вы проиграли","Alert",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error inNumbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Task11();
    }
}