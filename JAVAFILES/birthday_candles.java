import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=0,j;
        int a[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            a[height_i] = in.nextInt();
        }
        int max=a[0];
        for (j=1;j<n;j++)
            {
            if(a[j]>max)
                max=a[j];
        }
        for(j=0;j<n;j++)
            {
            if(a[j]==max)
                p++;
        }
        System.out.print(p);
    }
}
