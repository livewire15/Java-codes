import java.util.*;
class avg_pairs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int pos[]=new int[1000];
int neg[]=new int[1000];
int arr[]=new int[n+1];
for(int i=0;i<n;i++)
{
int num=sc.nextInt();
arr[i]=num;
if(num>0)
pos[num]=1;
else
{
num=-num;
neg[num]=1;
}
}

int count=0;
for(int i=0;i<n-1;i++)
{
int pos_temp[]=new int[1000];
int neg_temp[]=new int[1000];
int sum=0;
if(arr[i]%2==0)
{
for(int j=i+1;j<n;j++)
{
if(arr[j]%2==0)
{
if(arr[j]>0)
{
if(pos_temp[arr[j]]==0)
{
sum=(arr[i]+arr[j])/2;
if(sum>=0)
{
if(pos[sum]==1)
{
count++;
pos_temp[arr[j]]=1;
}
else
{
pos_temp[arr[j]]=-1;
}
}
else
{
	sum=-sum;
	if(neg[sum]==1)
{
count++;
neg_temp[arr[j]]=1;
}
else
{
neg_temp[arr[j]]=-1;
}
}
}
else if(pos_temp[arr[j]]==1)
{
count++;
}
}
else
{
int val=-arr[j];
if(neg_temp[val]==0)
{
sum=(arr[i]+val)/2;
if(sum>=0)
{
	if(pos[sum]==1)
	{
		count++;
		pos_temp[val]=1;
	}
	else
	{
		pos_temp[val]=-1;
	}
}
else
{
	sum=-sum;
	if(neg[sum]==1)
	{
		count++;
		neg_temp[val]=1;
	}
	else
	{
	neg_temp[val]=-1;
	}
}
}
else if(neg_temp[val]==1)
{
count++;
}
}
}
}
}
else if(arr[i]%2!=0)
{
for(int j=i+1;j<n;j++)
{
if(arr[j]%2!=0)
{
if(arr[j]>0)
{
if(pos_temp[arr[j]]==0)
{
sum=(arr[i]+arr[j])/2;
if(sum>=0)
{
if(pos[sum]==1)
{
count++;
pos_temp[arr[j]]=1;
}
else
{
pos_temp[arr[j]]=-1;
}
}
else
{
	sum=-sum;
	if(neg[sum]==1)
{
count++;
neg_temp[arr[j]]=1;
}
else
{
neg_temp[arr[j]]=-1;
}
}
}
else if(pos_temp[arr[j]]==1)
{
count++;
}
}
else
{
	int val=-arr[j];
if(neg_temp[val]==0)
{
sum=(arr[i]+val)/2;
if(sum>=0)
{
	if(pos[sum]==1)
	{
		count++;
		pos_temp[val]=1;
	}
	else
	{
		pos_temp[val]=-1;
	}
}
else
{
	sum=-sum;
if(neg[sum]==1)
{
count++;
neg_temp[val]=1;
}
else
{
neg_temp[val]=-1;
}
}
}
else if(neg_temp[val]==1)
{
count++;
}
}
}
}
}
}
System.out.println(count);
t--;
}
} 
}