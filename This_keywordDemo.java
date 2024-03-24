class This_keywordDemo{
	
	int a;


	This_keywordDemo(int a){

		this.a=a;
	}
	public void show(){
		
		System.out.println(a);
	}
	public static void main(String[] args){

		This_keywordDemo obj = new This_keywordDemo(100);
		obj.show();
	}
}

