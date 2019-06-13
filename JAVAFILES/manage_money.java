import java.util.*;
import java.util.Arrays;
class manage_money
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q>0)
		{
		double s=0.0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		int d=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		//System.out.println(k+" "+x*Math.pow(10,-2)*arr[i]);
		s=s+Math.max(k,x*Math.pow(10,-2)*arr[i]);
		//System.out.println("s="+s);
		}
		//System.out.println("s="+s);
		//System.out.println();
		if(s<=d)
		System.out.println("fee");
		else
		System.out.println("upfront");
		q--;
		}
		}
		}
		