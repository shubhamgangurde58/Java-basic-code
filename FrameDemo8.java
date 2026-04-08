import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameDemo8{

    JFrame f;
    JPanel p;
    JLabel lblNo1 , lblNo2 , lblAdd;
    JTextField txtNo1 , txtNo2 , txtAdd;

    JButton btnAdd , btnCancel;


    public FrameDemo8(){

        f = new JFrame();
        p = new JPanel();
        lblNo1 = new JLabel("Enter the First No : ");
        lblNo2 = new JLabel("Enter the Second No : ");
        lblAdd = new JLabel("The Addition : ");

        txtNo1 = new JTextField();
        txtNo2 = new JTextField();
        txtAdd = new JTextField();

        btnAdd = new JButton("Addition");
        btnCancel = new JButton("Cancel");

        lblNo1.setBounds(50,50,150,30);
        p.add(lblNo1);

        txtNo1.setBounds(50,90,150,30);
        p.add(txtNo1);
        txtNo1.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent fe){

                txtNo1.setBackground(Color.LIGHT_GRAY);

            }

            public void focusLost(FocusEvent f2){

                txtNo1.setBackground(Color.WHITE);

            }

        });

        lblNo2.setBounds(50,140,150,30);
        p.add(lblNo2);

        txtNo2.setBounds(50,180,150,30);
        p.add(txtNo2);

         txtNo2.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent fe){

                txtNo2.setBackground(Color.LIGHT_GRAY);

            }

            public void focusLost(FocusEvent f2){

                txtNo2.setBackground(Color.WHITE);

            }

        });

        lblAdd.setBounds(50,230,150,30);
        p.add(lblAdd);

        txtAdd.setBounds(50,270,150,30);
        p.add(txtAdd);

         txtAdd.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent fe){

                txtAdd.setBackground(Color.LIGHT_GRAY);

            }

            public void focusLost(FocusEvent f2){

                txtAdd.setBackground(Color.WHITE);

            }

        });

        btnAdd.setBounds(50,320,80,30);
        p.add(btnAdd);
        btnAdd.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){

                int a = Integer.parseInt(txtNo1.getText().toString());

                int b = Integer.parseInt(txtNo2.getText().toString());

                int c = a+b;

                txtAdd.setText(String.valueOf(c));

                txtNo1.setText("");
                txtNo2.setText("");
                txtNo1.requestFocus();

            }
            
         });

        btnCancel.setBounds(140,320,80,30);
        p.add(btnCancel);

        btnCancel.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){

                f.dispose();

            }

        });



        p.setLayout(null);
        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame ");
        f.setLocation(450,50);
        f.setVisible(true);

    }

    public static void main(String args[]){

            new FrameDemo8();

    }

}