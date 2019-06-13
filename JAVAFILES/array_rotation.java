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
        int b[]=new int[q];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int p=0;
        while(p<k)
            {
            int x=a[n-1];
            for(int i=n-2;i>=0;i--)
                {
                a[i+1]=a[i];
            }
            a[0]=x;
            p++;
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            b[a0]=a[m];
        }
        for(int j=0;j<q;j++)
            System.out.println(b[j]);
    }
}
