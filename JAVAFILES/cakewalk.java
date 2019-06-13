import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cakewalk
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
		Arrays.sort(calories);
		int j=n-1,p=0;
		long s=0;
		while(j>=0)
		{
		s=s+(long)(Math.pow(2,p)*calories[j]);
		j--;
		p++;
		}
		System.out.println(s);
    }
}
