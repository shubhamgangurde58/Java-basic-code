import java.util.*;

public class CountingSort{

    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));

        for (int num : arr) {
            result.set(num, result.get(num) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            arr.add(sc.nextInt());

        }

        List<Integer> result = countingSort(arr);

        for (int count : result) {

            System.out.print(count + " ");

        }

        sc.close();
    }
}