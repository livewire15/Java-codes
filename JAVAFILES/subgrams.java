import java.util.*;
class subgrams
{
public static void main(String args[])
{
int n;
String s3="";
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
String a[]=new String[n];
int min=101,pos=0;
for(int i=0;i<n;i++)
{
a[i]=sc.next();
if(a[i].length()<min)
{
min=a[i].length();
pos=i;
}
}

int k=0;

while(k<a[pos].length())
{
int count=1;
for(int j=0;j<n;j++)
{
int flag=0;
if(j!=pos)
{
int p=0;
while(p<a[j].length())
{
if(a[pos].charAt(k)==a[j].charAt(p))
{
flag=1;
break;
}
p++;
}

if(flag==1)
{
count+=1;;
if(count==n)
{
s3=s3+a[pos].charAt(k);
System.out.println(s3);
count=0;
}
}
else
{
k++;
break;
}
}
}
}
if(s3!="")
System.out.println(s3);
else
System.out.println("no such string");
}
}