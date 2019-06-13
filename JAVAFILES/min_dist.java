import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class min_dist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int min=n,flag=0;
		for(int i=0;i<A.length-1;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(A[i]==A[j])
		{
			flag=1;
		if(Math.abs(i-j)<min)
		min=Math.abs(i-j);
		}
		}
		}
		if(flag==1)
		System.out.println(min);
	else
				System.out.println(-1);
    }
}
