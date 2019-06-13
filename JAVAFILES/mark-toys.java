import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class mark_toys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
		int k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) 
		prices[i]=stdin.nextInt();
        Arrays.sort(prices);
        int answer =0;
		for(int j=0;j<n;j++)
		{
		if(s<=k)
		{
		s=s+a[j];
		answer++;
		}
		}
        // Compute the final answer from n,k,prices 
        System.out.println(answer);
    }
}
