class	Multilevel_Aclass extends Multilevel_B_class{

	public void show(){
		System.out.println("This is A class");
	}
	
	public static void main(String[] args){

		
		Multilevel_Aclass multilevel_Aclass = new  Multilevel_Aclass();

		multilevel_Aclass.show();
		multilevel_Aclass.show_B();
		multilevel_Aclass.show_c();
	}
}