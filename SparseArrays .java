import java.util.*;

class Result {

    public static void sparseArrays(String strings[], String queries[]) {

        for (int i = 0; i < queries.length; i++) {

            int count = 0;

            for (int j = 0; j < strings.length; j++) {

                if (queries[i].equals(strings[j])) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

public class SparseArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String strings[] = new String[n];

        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        sc.nextLine();

        String queries[] = new String[q];

        System.out.println("Enter the queries: ");
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextLine();
        }

        Result.sparseArrays(strings, queries);
    }
}