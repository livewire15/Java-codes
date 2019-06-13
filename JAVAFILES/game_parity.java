import java.util.*;
import java.util.Arrays;
class game_parity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int s=0;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		s=s+arr[i];
		}
		if(s%2==0)
		System.out.println(0);
		else
		{
			if(n==1)
				System.out.println(-1);
			else
			{
		for(int j=0;j<n;j++)
		{
		if(arr[j]%2!=0)
		{
		System.out.println(1);
		break;
		}
		}
		}
		}
		}
		}