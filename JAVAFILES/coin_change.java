import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class coin_change {
		static long sum=0;
    static long getWays(long n, long[] c){
        // Complete this function.
		if(n<0)
		return 0;
		else if(n==0)
		return 1;
		else
		{
		for(int i=0;i<c.length;i++)
			sum+=getWays(n-c[i],c); 
		}
		return sum;
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
        long ways = getWays(n, c);
		System.out.println(ways);
    }
}
