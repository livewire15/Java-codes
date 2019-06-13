import java.util.*;
 class SubsetsGood
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		if(arr[i]==1)
			flag=1;
		}
		if(flag==1)
			System.out.println("YES");
		else
		{
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(arr[i]%arr[j]!=0 && arr[j]%arr[i]!=0 && arr[i]!=arr[j])
		{
		flag=1;
		break;
		}
		}
		if(flag==1)
			break;
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
		t--;
		}
		}
		}
		