import java.util.Scanner;
import java.util.*;
 
public class distribute_candies{

	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int start=0;
		int end=a[n-1];
		int mid=0,ans=0;
		while(start<=end)//binary search
		{
		mid=(start+end)/2;
		if(possible(a,k,mid))//if found at mid element then check in the other half for highest possibility
		{
		start=mid+1;
		ans=mid;
		}
		else//else if not found at mid element then return the previous ans stored.
		{
		end=mid-1;
		}
		}
		System.out.println(ans);
		t--;
		}
	}
	
		static boolean possible(int arr[],int k,int mid)
		{
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
		s=s+arr[i]/mid;
		if(s>=k)
		{
		return true;
		}
		}
		return false;
		}
	}
