import java.util.*;
class capple
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
int time=0,min=1000000;
int n=sc.nextInt();
int a[]=new int[1000000];

//tree having min apples
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
if(a[j]<min)
min=a[j];               
}
int k;

//finding similar subsets
for(k=0;k<n-1;k++)
{
if(a[k]>min)
{
for(int j=k+1;j<n;j++)
{
if(a[j]==a[k])
{
a[j]=min;
}//initializing similar subsets with min 
}
time++;
a[k]=min;
}
}

if(a[k]==min)
;
else
time++;

time++;
System.out.println(time);
}
}
}