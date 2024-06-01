
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExDemo2{
	public static void main(String args[]){

		String name= "shubham";
		String nameEx = "^[A-z]{1}[A-Za-z]{3,}$";

		Pattern pattern = Pattern.compile(nameEx);
		Matcher matcher = pattern.matcher(name);

		System.out.println(matcher.matches());

	}
}