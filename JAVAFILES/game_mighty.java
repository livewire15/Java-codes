import java.util.*;
class game_mighty
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int motu[]=new int[n/2+1];
int tomu[]=new int[n/2];
long sum1=0,sum2=0;
int i1=0,i2=0;

for(int i=0;i<n;i++)
{
	if(i%2==0)
	{
	motu[i1]=sc.nextInt();
	sum1+=motu[i1];
	i1++;
	}
	else
	{
	tomu[i2]=sc.nextInt();
	sum2+=tomu[i2];
	i2++;
	}
}
Arrays.sort(motu);
Arrays.sort(tomu);
int len=motu.length-1,p=0,flag=0;

while(k>0)
{
if(sum2<=sum1 && motu[len]>tomu[p])
{
sum2+=motu[len]-tomu[p];
sum1+=tomu[p]-motu[len];
int temp=tomu[p];
tomu[p]=motu[len];
motu[len]=temp;
Arrays.sort(motu);
Arrays.sort(tomu);
}
else
{
break;
}
k--;
}

if(sum2<=sum1)
System.out.println("NO");
else
System.out.println("YES");
t--;
}
}
}
