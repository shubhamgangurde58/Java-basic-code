
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;


class GUIDemo1 extends Component{

	public static void main(String args[]){

		Frame f = new Frame();
		f.setSize(500,500);
		f.setTitle("My Frame");
		f.setLocation(100,100);
		f.add(new GUIDemo1());
		f.setVisible(true);
	
	}

	public void paint(Graphics g){

		g.setColor(Color.RED);
		g.fillRect(50,50,150,150);
		g.setColor(Color.YELLOW);
		g.fillOval(50,50,150,150);
		g.setColor(Color.BLACK);
		g.drawLine(50,50,200,200);
	}

}