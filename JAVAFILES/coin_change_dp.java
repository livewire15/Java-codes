import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(int n, long[] c,int m,int p,long ans[][]){
        // Complete this function
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(m==0)
            return 0;
        if(ans[n][m]>0)
            return ans[n][m];
        else
        {
            long first=getWays(n-(int)c[p],c,m,p,ans);
            long second=getWays(n,c,m-1,p+1,ans);
            ans[n][m]=first+second;
            return first+second;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ans[][]=new long[n+1][m+1];
        long ways = getWays(n, c,m,0,ans);
        System.out.println(ways);
    }
}
