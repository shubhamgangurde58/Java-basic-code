
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;

class FrameDemo1 extends Component{

    public static void main(String args[]){

        Frame f = new Frame();

        f.setSize(500,500);
        f.setTitle("My Frame");
        f.add(new FrameDemo1());
        f.setLocation(0,0);
        f.setVisible(true);

    }

    public void paint(Graphics g){

        g.setColor(Color.RED);
        g.fill3DRect(50, 50, 200, 200, true);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 250, 250);


    }

}