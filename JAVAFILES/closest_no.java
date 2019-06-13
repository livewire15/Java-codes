import java.io.*;
import java.util.*;

public class closest_no {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int min=10000000;
		for(int i=0;i<n-1;i++)
		{
		if(Math.abs(arr[i]-arr[i+1])<min)
		{
		min=Math.abs(arr[i]-arr[i+1]);
		}
		}
		int arr1[]=new int[n+n];
		Arrays.fill(arr1,10000000);
		int k=0;
		for(int j=0;j<n-1;j++)
		{
		if(Math.abs(arr[j]-arr[j+1])==min)
		{
			//System.out.println("j="+j);
			//System.out.println("k="+k);
		arr1[k]=arr[j];
		k=k+1;
		//System.out.print(arr[j]+" "+arr[j+1]);
		arr1[k]=arr[j+1];
		//System.out.println(arr1[k]);
		k++;
		}
		}
		//System.out.print(k);
		
		Arrays.sort(arr1);
		for(int j=0;j<k;j++)
		{
		System.out.print(arr1[j]+" ");
		}
    }
}