import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }

        return "YES";
    }
}

public class TwoArrays{

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        while (q-- > 0) {

            String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);
            int k = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> A = Stream.of(bufferedReader.readLine().trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            List<Integer> B = Stream.of(bufferedReader.readLine().trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            System.out.println(Result.twoArrays(k, A, B));
        }

        bufferedReader.close();
    }
}