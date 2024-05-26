
import java.util.*;

class VectorDemo1{

	public static void main(String args[]){
		
		Vector<String>   nameVector = new Vector<>();
	
		nameVector.add("Shubham");
		nameVector.add("Ritesh");
		nameVector.add("Jayesh");
		nameVector.add("Yogesh");
		nameVector.add("Chetan")

		for(String str : nameVector){
			System.out.println(str);
		}
	}
} 