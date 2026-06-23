import java.io.*;
import java.util.*;

public class FlippingBits{

    public static long flippingBits(long n) {
        return 4294967295L - n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            long n = Long.parseLong(br.readLine());
            System.out.println(flippingBits(n));
        }
    }
}