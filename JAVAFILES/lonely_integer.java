import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     private static int lonelyInteger(int[] a) {
         int i;
        for( i=0;i<a.length;i++)
            {
            int p=1;
            if(a[i]!=-1)
                {
            for(int j=i+1;j<a.length;j++)
                {
                if(a[i]==a[j])
                    {
                    p++;
                    a[j]=-1;
                }
            }
            if(p==1)
                break;
        }
    }
         return a[i];
     }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
