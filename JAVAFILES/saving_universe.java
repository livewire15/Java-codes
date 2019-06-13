import java.util.*;
class Solution
{
static void calc(String s,long d,int k)
{
PriorityQueue<Long> pq=new PriorityQueue<Long>(Collections.reverseOrder());
long strength=1,power=0,damage=0;
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='C')
{
power+=1;
}
else if(power>0)
{
pq.add(power);
}
}

for(int j=0;j<s.length();j++)
{
	if(s.charAt(j)=='S')
	{
		damage+=strength;
	}
	else
	{
		strength=strength*2;
	}
}

if(damage<=d)
	System.out.println("Case #"+(k+1)+":"+" "+0);
else
{
	long num=0;
	int flag=0;
	while(!pq.isEmpty())
	{
		num=pq.poll();
		if(num!=1)
		{
			pq.add(num-1);
			damage=damage-2;
		}
		if(num==1)
		{
			damage=damage-1;
		}
		count++;
		if(damage<=d)
		{
			flag=1;
			break;
		}
	}
	
	if(flag==0)
		System.out.println("Case #"+(k+1)+":"+" "+"IMPOSSIBLE");
	else 
		System.out.println("Case #"+(k+1)+":"+" "+count);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int k=0;k<t;k++)
{
long d=sc.nextLong();
String s=sc.next();
calc(s,d,k);
}
}
}
	