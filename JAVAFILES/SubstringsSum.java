import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrings function below.
    static long substrings(String n) {
    long sum=0;
    long f=1;
    for(int i=n.length()-1;i>=0;i--)
    {
        sum+=(((int)n.charAt(i)-48)*(i+1)*f)%(1000000000+7);
        f=(f*10+1)%(1000000000+7);
    }
    return sum%(1000000000+7);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String n = scanner.nextLine();

        long result = substrings(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
