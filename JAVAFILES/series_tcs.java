import java.util.*;
 class series_tcs
 {
int s=0;
 int fact(int x)
 {
 if(x==0)
 return 0;
 else
{
s=s+x;
x--;
fact(x);
}
return s;
}

 public static void main(String args[])
 {
int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int dif=22,c=0,sum=6;
 series_tcs obj=new series_tcs();
int t=obj.fact(n);
 int a[]=new int[t];
a[0]=6;
 for(int i=0;i<t-1;i++)
 {
 c=22+16*i;
 sum=sum+c;
a[i+1]=sum;
}

int p=0,y=n-1;
for(int j=n;j>=1;j--)
{
for(int m=1;m<=y;m++)
{
	System.out.print(" ");
}
for(int k=n;k>=j;k--)
{
String s1=Integer.toString(a[p]);
if(s1.length()<5)
{
	if(5-s1.length()==1)
		System.out.print("0"+a[p++]+" ");
	else if(5-s1.length()==2)
		System.out.print("00"+a[p++]+" ");
	else if(5-s1.length()==3)
		System.out.print("000"+a[p++]+" ");
	else if(5-s1.length()==4)
		System.out.print("0000"+a[p++]+" ");
}
else
System.out.print(a[p++]+" ");
}
System.out.println();
y--;
}
 }
 }