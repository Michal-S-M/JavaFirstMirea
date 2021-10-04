package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main extends JFrame
{
    JButton button = new JButton("Command one");
    JButton button2 = new JButton("Command two");
    JLabel lbl = new JLabel("");
    JLabel lbl2 = new JLabel("");
    JLabel lbl3 = new JLabel("");
    static int x1=0,x2=0;
    Main()

    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(lbl,BorderLayout.NORTH);
        add(lbl2,BorderLayout.NORTH);
        add(lbl3,BorderLayout.NORTH);
        add(button);
        add(button2);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                x1=x1+1;
                lbl.setText(x1+" X "+x2);
                lbl2.setText("Last Scorer: Command one");
                if (x1>x2) lbl3.setText("Winner: command one");
                else lbl3.setText("Winner: command two");
            }
        });
        setVisible(true);

        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                x2=x2+1;
                lbl.setText(x1+" X "+x2);
                lbl2.setText("Last Scorer: Command two");
                if (x1>x2) lbl3.setText("Winner: command one");
                else lbl3.setText("Winner: command two");
            }
        });
        setVisible(true);
    }
    public static void main(String[]args) {
        new Main();
    }
}