import java.awt.*;
import java.awt.event.*;

class FrameDemo7 extends Frame implements ActionListener
{
    CardLayout cl;
    Panel p;
    Button b1,b2;

    FrameDemo7()
    {
        cl = new CardLayout();
        p = new Panel();

        p.setLayout(cl);

        Panel card1 = new Panel();
        card1.add(new Label("This is Card 1"));

        Panel card2 = new Panel();
        card2.add(new Label("This is Card 2"));

        p.add(card1,"First");
        p.add(card2,"Second");

        b1 = new Button("Next");
        b2 = new Button("Previous");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(p,BorderLayout.CENTER);

        Panel buttons = new Panel();
        buttons.add(b1);
        buttons.add(b2);

        add(buttons,BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            cl.next(p);
        }
        else
        {
            cl.previous(p);
        }
    }

    public static void main(String args[])
    {
        new FrameDemo7();
    }
}