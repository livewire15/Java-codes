import java.util.*;
class test16 
{	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		//
		int min1=Math.min(a,Math.min(b,c));
		int min2=Math.min(x,y);
		if((a+b+c)==x+y)
		{
			if(min1>min2)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		else
			System.out.println("NO");
			t--;
			}
			}
			}