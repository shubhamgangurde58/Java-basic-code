
import java.util.HashSet;
class RecursionQuestion16{


	public static void subSequences(String str,int index,String newStr,HashSet<String> set){

		if(index == str.length()){
		
			if(set.contains(newStr)){

				return;
			}else{

				System.out.println(newStr);
				set.add(newStr);
				return;
			}
			
		}

		char currChar = str.charAt(index);

		// to be
		subSequences(str,index+1,newStr + currChar,set);

		
		
		// not to be
		subSequences(str,index+1,newStr,set);
	
	}

		

	public static void main(String args[]){
			
		HashSet<String> set = new HashSet<>();

		String str ="aaa";

		subSequences(str,0,"",set);
	}
}