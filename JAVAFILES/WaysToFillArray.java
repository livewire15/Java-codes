import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WaysToFillArray {

    // Complete the countArray function below.
    static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
        long dp[][]=new long[n+1][2+1];
        dp[1][1]=1;
        dp[1][2]=0;
        dp[2][1]=0;
        dp[2][2]=1;
        for(int i=3;i<=n;i++)
        {
            long val=dp[i-1][2]%(1000000000+7);
            dp[i-1][2]=(dp[i-1][2]*(k-1))%(1000000000+7);
            dp[i][1]=dp[i-1][2]%(1000000000+7);
            dp[i][2]=(dp[i-1][1]+dp[i-1][2]-val)%(1000000000+7);       
        }
        if(x==1)
            return dp[n][1]%(1000000000+7);
        else
           return dp[n][2]%(1000000000+7);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkx = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkx[0]);

        int k = Integer.parseInt(nkx[1]);

        int x = Integer.parseInt(nkx[2]);

        long answer = countArray(n, k, x);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
