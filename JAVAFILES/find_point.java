import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class find_point {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		int q1=sc.nextInt();
		int q2=sc.nextInt();
		int r1=2*q1-p1;
		int r2=2*q2-p2;
		System.out.println(r1+" "+r2);
		}
    }
}