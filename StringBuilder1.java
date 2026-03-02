
import java.util.Scanner;
class StringBuilder1{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Nhub");

		System.out.println(sb);

		//setCharAt()

		sb.setCharAt(0,'S');
		System.out.println(sb);
		

		//String insert

		sb.insert(4,'h');
		System.out.println(sb);
		sb.insert(5,'a');
		System.out.println(sb);
		sb.insert(6,'m');
		System.out.println(sb);
		
		//String Deleted

		sb.delete(4,5);
		System.out.println(sb);
		sb.delete(4,5);
		System.out.println(sb);
		sb.delete(4,5);
		System.out.println(sb);
		
		//appand function

		sb.append("h");
		sb.append("a");
		sb.append("m");
		sb.append("!");

		System.out.println(sb);

		for(int i=0;i<sb.length()/2;i++){

			int front = i;
			int back = sb.length()-1-i;

			char frontchar = sb.charAt(front);
			char backchar = sb.charAt(back);

			sb.setCharAt(front , backchar);
			sb.setCharAt(back , frontchar);

		}

		System.out.println(sb);
	}
	
}