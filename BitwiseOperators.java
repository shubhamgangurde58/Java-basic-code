class BitwiseOperators{

	public static void binaryAND(int a,int b){

		System.out.println("The Symbol of AND &");
		int c = (a&b);
		System.out.println(c);
	}

	public static void binaryOR(int a,int b){

		System.out.println("The Symbol of OR |");
		int c = (a|b);
		System.out.println(c);
	}

	public static void binaryXOR(int a,int b){

		System.out.println("The Symbol of XOR ^");
		int c = (a^b);
		System.out.println(c);
	}	
	
	public static void binaryComplement(int a,int b){

		System.out.println("The Symbol of complement ~");
		int c = ~a;
		System.out.println(c);
	}

	public static void main(String args[]){

		int a=9;
		int b=7;

		binaryAND(a,b);
		binaryOR(a,b);
		binaryXOR(a,b);
		binaryComplement(a,b);
	}
}