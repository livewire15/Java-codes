import java.util.Scanner;
import java.util.*;

public class murder_case {

	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		long b[]=new long[1];
		b[0]=0;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		int start=0;
		int end=0,mid=0;
		for(int i=1;i<n;i++)
		{
		end=i-1;
		start=0;
		Arrays.sort(arr,start,end+1);
		while(start<=end)//binary search
		{
		mid=(start+end)/2;		
		if(possible(arr,mid,i,start,b))//if mid element is less than the present number then sum all the numbers before mid element
		{
		start=mid+1;
		}
		else//else if mid element is greater then find another mid element
		{
		end=mid-1;
		}
		}
		}
		System.out.println(b[0]);
		t--;
	}
	}
	
	static boolean possible(int arr[],int mid,int i,int start,long b[])
	{
	if(arr[mid]<arr[i])
	{
	for(int j=start;j<=mid;j++)
	{
	b[0]+=arr[j];//sum all elements before mid element
	}
	return true;
	}
	else
	return false;
	}

}