import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class abs_diff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextLong();
        }
        // your code goes here
		Arrays.sort(a);
		long min=1000000001;
		for(int i=0;i<a.length-1;i++)//better to use single loop for saving time.
		{
		if(Math.abs(a[i]-a[i+1])<min)
		{
		min=Math.abs(a[i]-a[i+1]);
		}
		}
		System.out.println(min);
    }
}
