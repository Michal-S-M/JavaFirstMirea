package ru.mirea.Task11;

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
                //lbl2.setText("X="+a.getX()+" Y="+a.getY()+" 200-a.getX(): "+(200-a.getX()));
            }
            public void mouseEntered(MouseEvent a) {
                if((a.getY()>(400-a.getX()))&&(a.getY()>a.getX()))
                    lbl2.setText("Вы находитесь на юге");
                else if ((a.getY()>(400-a.getX()))&&(a.getY()<a.getX()))
                    lbl2.setText("Вы находитесь на востоке");
                else if ((a.getY()<(400-a.getX()))&&(a.getY()<a.getX()))
                    lbl2.setText("Вы находитесь на севере");
                else if ((a.getY()<(400-a.getX()))&&(a.getY()>a.getX()))
                    lbl2.setText("Вы находитесь на западе");

            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new Task11three().setVisible(true);
    }
}