class RecursionQuestion12{

	public static int count = 0;

	public static void addLastX(String str,int index ,int count ,String newStr){

		if(index == str.length()){

			for(int i=0;i<count;i++){

				newStr += 'x';
			}
			System.out.print(newStr);

			return;
		}
			
		
		char currChar = str.charAt(index);

		if( currChar == 'x'){

			count += 1;
			
			addLastX(str,index+1,count,newStr);

		}else{

			newStr +=  currChar;
			addLastX(str,index+1,count,newStr);
		}

	}

	public static void main(String args[]){

		String str = "axbcxxd";

		String newStr = "";

		int count = 0;

 		addLastX(str,0,count,newStr);
				
		
	}
}