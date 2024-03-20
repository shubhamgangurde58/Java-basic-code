
class Single_Superclass{

	public void show(){

		System.out.println("This is super class");	
	}
}

class Single_Subclass extends Single_Superclass {
	
	public void showSub(){
		System.out.println("This is sub class");
	}
	
	public static void main(String[] args){
	
		Single_Subclass single_Subclass = new Single_Subclass();
		
		single_Subclass.show();
		single_Subclass.showSub(); 
		
	}
}