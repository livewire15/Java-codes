import java.util.*;
class num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		if(a<0 && n%2==0)
			a=-a;
		if(b<0 && n%2==0)
			b=-b;
		
		if(a==b)
			System.out.println(0);
		else if(a>b)
			System.out.println(1);
		else
			System.out.println(2);
		t--;
		}
		}
		}
			