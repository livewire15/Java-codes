import java.util.*;
class prime_pair
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int prime[]=new int[101];
		Arrays.fill(prime,0);
		for(int i=2;i<=100;i++)
		{
			if(prime[i]==0)
			{
			for(int j=i+i;j<=100;j=j+i)
			{
				prime[j]=-1;
			}
			}
		}
		
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=-1;
		int count=0;
		for(int i=0;i<n;i++)
		{
		int val=sc.nextInt();
		if(val==1)
			count++;
		arr[i]=val;
		}
		
		if(count==0)
			System.out.println(-1);
		else if(count==n)
			System.out.println(1);
		else
		{
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
					continue;
				else
				{
					if(prime[arr[i]]==0)
					{
						min=arr[i];
						break;
					}
				}
			}
			System.out.println(min);
		}
		t--;
		}
		}
		}
		
		