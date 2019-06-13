import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minuteToWinIt function below.
    static int minuteToWinIt(int[] a, int k) {
        // Return the minimum amount of time in minutes.
        long b[]=new long[a.length];
        for(int i=0;i<a.length;i++)
        {
          long first=a[i]-k*i;
          long sum=a.length*(2*first+(a.length-1)*k)/2;    
          b[i]=sum;
        }
       Arrays.sort(b);
        int max=0,count=0;
       for(int i=0;i<b.length-1;i++)
       {
        if(b[i]==b[i+1])
        {
            count+=1;
            if(count>max)
                max=count;
        }
           else
               count=0;
       }
        return a.length-(max+1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minuteToWinIt(a, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
