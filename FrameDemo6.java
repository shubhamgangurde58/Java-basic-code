
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class FrameDemo6{

    JFrame f;
    JPanel p;


    public FrameDemo6(){

        f = new JFrame();
        p = new JPanel();
        p.setLayout(new GridLayout(4,4,10,10));


        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        p.add(new JButton("+"));

        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("-"));

        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("*"));

        p.add(new JButton("0"));
        p.add(new JButton("."));
        p.add(new JButton("="));

        p.add(new JButton("/"));
        f.add(p);
        f.setSize(300,300);
        f.setTitle("My Frame 4");
        f.setLocation(450,50);
        f.setVisible(true);
        

    }
    public static void main(String[] args) {
        
            new FrameDemo6();

    }

}