import java.util.*;
class goodPermutations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int num[]=new int[n+1];
		Arrays.fill(num,0);
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		if(arr[i]!=0)
			num[arr[i]]=1;
		}	
		
		if(arr[0]==0)
		{
		for(int j=1;j<=n;j++)
			{
				if(num[j]==0)
				{
				arr[0]=j;
				num[j]=1;
				break;
				}
			}
		}
		int sum=0;
		sum+=fun(arr,num,n,k,1);
		System.out.println(sum);
		t--;
		}
		}
		
		static int fun(int arr[],int num[],int n,int k,int i)
		{
		if(k==0)
		return 1;
		if(i>=arr.length)
		return 0;
			if(arr[i]==0)
			{
				for(int j=1;j<=n;j++)
				{
				if(num[j]==0)
				{
					arr[i]=j;
					num[j]=1;
					if(arr[i]>arr[i-1])
					{
						fun(arr,num,n,k-1,i+1);
					}
						return fun(arr,num,n,k,i+1);
				}
				}
			}
			else
			{
				return fun(arr,num,n,k,i+1);
			}
			return 0;
		}
		}