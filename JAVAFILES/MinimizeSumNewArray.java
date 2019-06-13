import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSum function below.
    static long minimumSum(int[] l, int[] r) {
        // Return the minimum sum among all arrays that satisfy the condition.
        int n=l.length, cl=0, cr=(int)1e9;
        long ans=0;
        for(int i=0; i<n; ++i) {
            cl=Math.max(l[i], cl);
            cr=Math.min(r[i], cr);
            if(cl>cr) {
                ans+=cl-cr;
                if(cl==l[i])
                    cr=cl;
                else
                    cl=cr;
            }
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] l = new int[n];

        String[] lItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int lItem = Integer.parseInt(lItems[i]);
            l[i] = lItem;
        }

        int[] r = new int[n];

        String[] rItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int rItem = Integer.parseInt(rItems[i]);
            r[i] = rItem;
        }

        long result = minimumSum(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
