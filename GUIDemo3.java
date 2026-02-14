
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class GUIDemo3{
	
	Frame f;
	Label lblUserName;
	Label lblPassword;

	TextField txtUserName;
	TextField txtPassword;


	public GUIDemo3(){
	
		f = new Frame();
		lblUserName = new Label();
		lblPassword = new Label();

		txtUserName = new TextField();
		txtPassword = new TextField();

		f.setSize(500,600);
		f.setTitle("My Frame");
		f.setLocation(350,100);	

		lblUserName.setText("Enter the UserName : ");
		lblUserName.setBounds(50,50,100,30);
		f.add(lblUserName);

		txtUserName.setBounds(50,50,150,30);
		f.add(txtUserName);

		lblPassword.setText("Enter the Password :");
		lblPassword.setBounds(50,50,200,30);
		f.add(lblPassword);

		txtPassword.setBounds(50,50,250,30);
		f.add(txtPassword);
	
		f.setVisible(true);	
	
	}

	public static void main(String args[]){
		
		new GUIDemo3();
	
	}
}