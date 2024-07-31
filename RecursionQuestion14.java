class RecursionQuestion14{


	public static boolean[] map = new boolean[26];

	public static void removeDuplicate(String str,int index,String newStr){

		if(index == str.length()){
		
			System.out.println(newStr);
			return;
		}

	
		char currChar = str.charAt(index);

		if(map[currChar - 'a'] == true){

			removeDuplicate(str,index+1,newStr);
		}else{

			newStr += currChar;
			map[currChar - 'a'] = true;
			removeDuplicate(str,index+1,newStr);
			
		}
	}

		

	public static void main(String args[]){
			
		String str ="abbcddeef";

		removeDuplicate(str,0,"");
	}
}