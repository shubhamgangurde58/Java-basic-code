
import java.util.*;
class ArrayListDemo1{
	
	public static void main(String args[]){
		
		ArrayList<String> namelist = new ArrayList<>();

		namelist.add("shubham");
		namelist.add("jayesh");
		namelist.add("ritesh");
		namelist.add("dipak");
		namelist.add("yogesh");

		for(String str : namelist){
			System.out.println(str);
		}
	}

}