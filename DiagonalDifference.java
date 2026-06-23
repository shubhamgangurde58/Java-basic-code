import java.io.*;
import java.util.*;

public class DiagonalDifference{

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<List<Integer>> arr = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {

            String[] values = br.readLine().split(" ");

            List<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                row.add(Integer.parseInt(values[j]));
            }

            arr.add(row);
        }

        System.out.println(diagonalDifference(arr));
    }
}