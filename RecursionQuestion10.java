class RecursionQuestion10{

	public static int first = -1;
	public static int last = -1;
	public static int total = 0;
	public static void findElement(String str,int index,char element){

		if(index == str.length()){

			System.out.println("first "+first);
			System.out.println("Last = "+last);

			System.out.println("Total A ="+total);
			return;
		}

		char currChar = str.charAt(index);

		if(currChar == element){
			
			total += 1;
			
			if(first == -1){
			
				first = index;		
			}else{

				last = index;
			}
		}
		findElement(str,index+1,element);

	}

	public static void main(String args[]){

		String str = "SADADFAFAFGAAF";

		findElement(str,0,'A');
	}
}