import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int j=0,p=0,sum;
        while((m+j)<=squares.length)
            {
            sum=0;
        for(int i=j;i<(m+j);i++)
            {
            sum=sum+squares[i];
        }
        if(sum==d)
            p++;
        j++;
    }
        return p;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
