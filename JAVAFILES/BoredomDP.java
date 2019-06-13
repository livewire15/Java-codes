import java.util.*;
class BoredomDP
{		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		long freq[]=new long[100001];
		int max=0;
		for(int i=0;i<n;i++)
		{
		int val=sc.nextInt();
		if(val>max)
			max=val;
		arr[i]=val;
		freq[val]++;
		}
		
		for(int i=2;i<=max;i++)
		{
		freq[i]=(long)Math.max(freq[i-1],freq[i-2]+(long)freq[i]*(long)i);
		}
		System.out.println(freq[max]);
		}
		}
		
		
		