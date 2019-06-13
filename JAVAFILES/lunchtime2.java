import java.util.*;
class lunchtime2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int count=0,flag=0,flag2=0;
if((c-a)%2==0)
{
int div=(c-a)/2;
if((2*(a+div)==a+c))
	flag=1;
if((2*(a-div)==a+c))
	flag2=1;
if(flag==1 && flag2==1)
count+=Math.min(Math.abs(b-(a+div)),Math.abs(b-(a-div)));
else if(flag==1)
	count+=Math.abs(b-(a+div));
else
	count+=Math.abs(b-(a-div));
}
else
{
	if((c-a)>0)
	{
	a=a+1;
	}
	else
	{
		a=a-1;
	}
count+=1;
int div=(c-a)/2;
if((2*(a+div)==a+c))
	flag=1;
if((2*(a-div)==a+c))
	flag2=1;
if(flag==1 && flag2==1)
count+=Math.min(Math.abs(b-(a+div)),Math.abs(b-(a-div)));
else if(flag==1)
	count+=Math.abs(b-(a+div));
else
	count+=Math.abs(b-(a-div));
}

//for c
int a1=a,b1=b,c1=c,count1=0;
int diff1=b1-a1;
b1=b1+diff1;
count1+=Math.abs(b1-c1);

//for a
int a2=a,b2=b,c2=c,count2=0;
int diff2=b2-a2;
b2=b2+diff2;
count2+=Math.abs(b2-c2);

int ans=Math.min(count,Math.min(count1,count2));
System.out.println(ans);
}
}
}