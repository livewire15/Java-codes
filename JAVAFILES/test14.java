import java.util.*;
import java.math.*;
 class test14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		BigInteger bg1=BigInteger.valueOf(2);
		//BigInteger bg2=BigInteger.valueOf(n);
		BigInteger bg3=BigInteger.valueOf(1);
		System.out.println((bg1.pow(n)).subtract(bg3));
		t--;
		}
	}
	}
		
	