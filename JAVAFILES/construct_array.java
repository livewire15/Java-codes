import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class construct_array {

    static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
		int arr[]=new int[n];
		arr[0]=1;
		arr[n-1]=x;
		long ap[]=new long[1];
		ap[0]=0;
		return countfun(n,k,x,arr,1,0,ap);
		}
		
		static long countfun(int n,int k,int x,int arr[],int j,long count,long ap[])
		{
		if(j>=n-1)
		{
		ap[0]=(ap[0]+1)%(long)(Math.pow(10,9)+7);
		}
		else
		{
		for(int i=1;i<=k;i++)
		{
		if(issafe(i,j,arr,n))
		{
		arr[j]=i;
		countfun(n,k,x,arr,j+1,count,ap);
		//arr[j]=0;
		}
		}
		}
		return ap[0]%(long)(Math.pow(10,9)+7);
		}
		
		static boolean issafe(int i,int j,int arr[],int n)
		{
		if(j==n-2)
		{
		if(arr[j-1]==i || arr[j+1]==i)
		return false;
		}
		else if(arr[j-1]==i)
					return false;
		
		return true;
		}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        long answer = countArray(n, k, x);
        System.out.println(answer);
        in.close();
    }
}
