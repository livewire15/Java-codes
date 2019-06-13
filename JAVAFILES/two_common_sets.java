import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int val=a[a.length-1];
        for(int i=val;i<=b[0];i++)
        {
            int flag=0;
            for(int j=a.length-1;j>=0;j--)
            {
                if(i%a[j]==0)
                    continue;
                else
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==0)
           {
                for(int j=0;j<b.length;j++)
                {
                    if(b[j]%i==0)
                        continue;
                    else
                    {
                        flag=-1;
                        break;
                    }
                }
                if(flag==0)
                    count++;                   
            }                
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
