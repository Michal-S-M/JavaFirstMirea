package ru.mirea.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Task11three extends JFrame
{
    JLabel lbl = new JLabel("");
    JLabel lbl2 = new JLabel("");
    public Task11three()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        add(lbl2,BorderLayout.NORTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                lbl2.setText("X="+a.getX()+" Y="+a.getY()+" 200-a.getX(): "+(200-a.getX()));
            }
            public void mouseEntered(MouseEvent a) {
/*
                if((a.getY()>(200-a.getX()))&&(a.getY()>a.getX()))
                    lbl2.setText("Вы посетили южные земли, мой лорд!");
                else if ((a.getY()>(200-a.getX()))&&(a.getY()<a.getX()))
                    lbl2.setText("Вы посетили восточные земли, мой лорд!");
                else if ((a.getY()<(200-a.getX()))&&(a.getY()<a.getX()))
                    lbl2.setText("Вы посетили северные земли, мой лорд!");
                else if ((a.getY()<(200-a.getX()))&&(a.getY()>a.getX()))
                    lbl2.setText("Вы посетили западыне земли, мой лорд!");
 */

            }
            public void mouseReleased(MouseEvent a) {
                if((a.getY()>(400-a.getX()))&&(a.getY()>a.getX()))
                    lbl.setText("Вы посетили южные земли, мой лорд!");
                else if ((a.getY()>(400-a.getX()))&&(a.getY()<a.getX()))
                    lbl.setText("Вы посетили восточные земли, мой лорд!");
                else if ((a.getY()<(400-a.getX()))&&(a.getY()<a.getX()))
                    lbl.setText("Вы посетили северные земли, мой лорд!");
                else if ((a.getY()<(400-a.getX()))&&(a.getY()>a.getX()))
                    lbl.setText("Вы посетили западыне земли, мой лорд!");
            }
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new Task11three().setVisible(true);
    }
}