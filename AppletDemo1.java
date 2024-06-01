
import java.applet.*;
public class AppletDemo1 extends Applet{

	public void init(){
		
		System.out.println("init called");
	}
	public void start(){

		System.out.println("start called");
	}
	public void stop(){

		System.out.println("stop called");
	} 
	public void distroy(){
	
		System.out.println("distroy called");
	}
}