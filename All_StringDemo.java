class All_StringDemo{

	public static void main(String[] args){
	
		String name1 = new String("yogesh");
		String name2 ="Shubham";
	
		//String length();
		System.out.println(name1.length());
		System.out.println(name2.length());

		//String concat();
		System.out.println(name1.concat(name2));

		//String StartWith();
		System.out.println(name1.startsWith("y"));
		System.out.println(name2.startsWith("h"));

		//String endsWith();
		System.out.println(name1.endsWith("s"));
		System.out.println(name2.endsWith("m"));

		//String equle();
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name1));

		//String replace();
		System.out.println(name1.replace("yogesh","Shubham"));
		System.out.println(name2.replace("Shubham","yogesh"));



	}
}