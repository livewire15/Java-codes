import java.util.*;
class test6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int minx=sc.nextInt();
int maxx=sc.nextInt();
int arr[][]=new int[n][2];
for(int i=0;i<n;i++)
{
arr[i][0]=sc.nextInt();
arr[i][1]=sc.nextInt();
}

int spam=0,nspam=0,diff=0,a=0,p=0,val=0;
int two[]=new int[2];
if(minx==maxx)
{
	while(p<n)
	{
		int ans=arr[p][0]*val+arr[p][1];
		val=ans;
		p++;
	}
	if(val%2==0)
	nspam++;
	else
	spam++;
}

	p=0;
for(int j=minx;j<=minx+1;j++)
{
int k=0;
val=j;
while(k<n)
{
int ans=arr[k][0]*val+arr[k][1];
val=ans;
k++;
}
two[p++]=val;
if(val%2==0)
	nspam++;
else 
	spam++;
}

if(maxx-minx>1)
{
diff=two[1]-two[0];
if(two[0]%2==0 && two[1]%2==0)
{
	nspam+=maxx-(minx+2)+1;
}
else if((two[0]%2==0 && two[1]%2!=0) )
{
	if((maxx-minx+1)%2==0)
	{
		spam+=(maxx-(minx+2))/2;
		nspam+=(maxx-(minx+2))/2;
	}
	else
	{
		spam+=(int)(maxx-(minx+2))/2;
		nspam+=(int)(maxx-(minx+2))/2+1;
	}
}
else if(two[1]%2==0 && two[0]%2!=0)
{
	if((maxx-minx+1)%2==0)
	{
		spam+=(maxx-(minx+2))/2;
		nspam+=(maxx-(minx+2))/2;
	}
	else
	{
		spam+=(int)(maxx-(minx+2))/2+1;
		nspam+=(int)(maxx-(minx+2))/2;
	}
}
else
{
	spam+=maxx-(minx+2)+1;
}
}

/*for(int j=minx+2;j<=maxx;j++)
{
val=val+diff;
if(val%2==0)
nspam++;
else
spam++;
}*/
System.out.println(nspam+" "+spam);
t--;
}
}
}


