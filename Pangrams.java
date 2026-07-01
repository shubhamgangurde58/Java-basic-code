import java.util.*;

public class Pangrams{

    public static String pangrams(String s) {

        boolean[] letters = new boolean[26];

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                return "not pangram";
            }
        }

        return "pangram";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(pangrams(s));

        sc.close();
    }
}