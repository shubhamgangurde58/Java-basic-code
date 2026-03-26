import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class FrameDemo11 extends  WindowAdapter{

    JFrame f;

    public FrameDemo11(){

        f = new JFrame();

        f.addWindowListener(this);
    

        f.setSize(400,500);
        f.setTitle("My Frame");
        f.setLocation(450,50);
        f.setVisible(true);

    }

    public void windowOpened(WindowEvent we1){
            System.out.println("Window Opened ! ");
    }

    public void windowClosing(WindowEvent we1){
            System.out.println("Window Closing ! ");
    }  

    public static void main(String[] args) {
        
            new FrameDemo11();

    }

}