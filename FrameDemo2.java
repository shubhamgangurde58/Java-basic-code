
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


class FrameDemo2{

    Frame f;
    Panel p;

    Label lblUsername , lblPassword;
    TextField txtUsername , txtPassword;
    Button btnSubmit , btnCancel;


    public FrameDemo2(){

        f = new Frame();
        p = new Panel();
        lblUsername = new Label();
        lblPassword = new Label();
        txtUsername = new TextField();
        txtPassword = new TextField();
        btnSubmit = new Button("Submit");
        btnCancel = new Button("Cancel");


        lblUsername.setText("Enter the UserName: ");
        lblUsername.setBounds(50,50,150,30);
        p.add(lblUsername);

        txtUsername.setBounds(50,80,150,30);
        p.add(txtUsername);

        lblPassword.setText("Enter the Password : ");
        lblPassword.setBounds(50,130,150,30);
        p.add(lblPassword);

        txtPassword.setBounds(50,170,150,30);
        p.add(txtPassword);

        btnSubmit.setBounds(50,220,80,30);
        p.add(btnSubmit);

        btnCancel.setBounds(130,220,80,30);
        p.add(btnCancel);

        p.setLayout(null);
        f.add(p);
        f.setSize(400,500);
        f.setTitle("My Frame2");
        f.setLocation(450,50);
        f.setVisible(true);


    }

    public static void main(String args[]){

        new FrameDemo2();

    }

}