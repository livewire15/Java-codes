import java.util.*;
class goodland_electricity
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int flag=0,pos=-1;
int arr[]=new int[n];
int k=sc.nextInt();
for(int i=0;i<n;i++) 
{
arr[i]=sc.nextInt();
if(arr[i]==1 && i<k)  //finding index of first 1
{
pos=i;
}
}

int count=1;

if(pos<k) //checking if position is less than the range
{
while(pos<n)
{
int flag1=0,t;
if((pos+k+k-1)>=n) //checking for last index of 1 and if value is not out of array bounds index
{
	int t1=pos+k,flag2=0;
	if(t1>=n)
	{
		flag2=1;
	}
	else
	{
		int t2=n-k-1;
		while(t2<n)
	{
		if(arr[t2]==1)
		{
			flag2=1;
			count++;
			break;
		}
		t2++;
	}
	}
	if(flag2==0)
	{
	System.out.println(-1);
	System.exit(0);
	}
break;	
}

if(arr[pos+k+k-1]!=1)
{
t=pos+k+k-1-1;
while(t>pos)
{
if(arr[t]==1)
{
flag1=1;
break;
}
t--;
}
if(flag1==0)
{
System.out.println(-1);
System.exit(0);
}
pos=t;
}
else
pos=pos+k+k-1;
count++;
}
System.out.println(count);
}
else
System.out.println(-1);
}
}