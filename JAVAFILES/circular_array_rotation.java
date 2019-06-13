import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
       int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        if(k>n)
        {
            k=k%n;
        }
        long temp=0;
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            temp=0;
            temp=n-k+m;
            if(temp>=n)
            {
                temp=temp-n;
            }
            System.out.println(a[(int)temp]);
        }
    }
}
