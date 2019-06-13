import java.util.*;
class weight_numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int wt[]={9,8,7,6,5,4,3,2,1,1};
int t=sc.nextInt();
while(t>0)
{
long n=sc.nextLong();
int w=sc.nextInt();
if(w==0)
{
	long ans=((wt[0]%(1000000000+7))*(expo(10,n-2)))%(1000000000+7);
System.out.println(ans);
}
else if(w==-9)
{
	w=-w;
	long ans=(((wt[w])%(1000000000+7))*expo(10,n-2))%(1000000000+7);
System.out.println(ans);
}
else if(w<0 && w>=-8)
{
	w=-w;
	long ans=(((wt[w]+1)%(1000000000+7))*expo(10,n-2))%(1000000000+7);
System.out.println(ans);
}
else if(w>0 && w<=8)
{
	long ans=((wt[w]%(1000000000+7))*expo(10,n-2))%(1000000000+7);
System.out.println(ans);
}
else
{
	System.out.println(0);
}
t--;
}
}

public static long expo(long x,long y)
{
	long val=1;
	while(y>0)
	{
		if(y%2!=0)
		{
			val=(val*x)%(1000000000+7);
		}
		x=(x*x)%(1000000000+7);
		y=y/2;
	}
	return val%(1000000000+7);
}
}