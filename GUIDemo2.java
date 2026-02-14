
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;


class GUIDemo2 extends Component{

	public static void main(String args[]){

		Frame f = new Frame();
		f.setSize(500,600);
		f.setTitle("My Frame");
		f.setLocation(350,100);
		f.add(new GUIDemo2());
		f.setVisible(true);
		
	}

	public void paint(Graphics g){
	
		g.setColor(Color.RED);
		g.fillRect(100,100,200,200);
		g.setColor(Color.YELLOW);
		g.fillOval(100,100,200,200);
		g.setColor(Color.BLACK);
		g.drawLine(100,100,300,300);
	
	}

} 