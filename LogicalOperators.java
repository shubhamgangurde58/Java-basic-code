class LogicalOperators{

	public static boolean logicalAnd(int a,int b,int c){

		if(a<b && b<c){
	
			return true;
		}else{
			return false;
		}
	}

	public static boolean logicalOr(int a,int b,int c){

		if(a<b || b<c){
	
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean logicalNot(int a,int b,int c){

		if(!(a<b)){
	
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String args[]){

		System.out.println("---Logical Operators---");

		int a=10;
		int b=20;
		int c=30;
			
		System.out.println("&& Condition is "+ logicalAnd(a,b,c));
		System.out.println("|| Condition is "+ logicalOr(a,b,c));
		System.out.println("! Condition is "+ logicalNot(a,b,c));
		
	}
}