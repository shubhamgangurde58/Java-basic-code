import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameDemo10 extends  MouseAdapter{


    JFrame f;
    JPanel p;

    JTextField txtMessage , txtMessage2;
    JLabel lblStatus;


    public FrameDemo10(){

        f = new JFrame();
        p = new JPanel();

        lblStatus = new JLabel("Status : DemoMessage ");
        txtMessage = new JTextField();
        txtMessage2 = new JTextField();

        txtMessage.setBounds(50,100,150,30);
        p.add(txtMessage);

        txtMessage.addKeyListener(new KeyListener(){

            public void keyPressed(KeyEvent ke){
                
            }

            public void keyReleased(KeyEvent ke2){
                lblStatus.setText("Status : Online ");
            }

            public void keyTyped(KeyEvent ke3) {
                lblStatus.setText("Status : Typing...");
            }

        });

        lblStatus.setBounds(50,150,150,30);
        p.add(lblStatus);
        lblStatus.setOpaque(true);

        lblStatus.addMouseListener(this);

        txtMessage2.setBounds(50,200,150,30);
        p.add(txtMessage2);

        p.setLayout(null);
        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame ");
        f.setLocation(450,50);
        f.setVisible(true);
    
    }

    public  void mouseEntered(MouseEvent me){
            lblStatus.setBackground(Color.GREEN);
    }

    public  void mouseExited(MouseEvent me2){
            lblStatus.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        
            new FrameDemo10();

    }

}