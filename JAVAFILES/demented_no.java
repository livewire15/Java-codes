import java.util.*;
class demented_no
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
long a=sc.nextInt();
long b=sc.nextInt();
HashSet<Integer> set1=new HashSet<Integer>();
HashSet<Integer> set2=new HashSet<Integer>();
int count=0;

for(long i=a;i<=b;i++)
{
HashSet<Integer> al=new HashSet<Integer>();
long n=i;
while(n>0)
{
int sum=0;
while(n>0)
{
int r=(int)n%10;
sum+=r*r;
n/=10;
}
if(set1.contains(sum))
{
	System.out.println(i);
//count++;
break;
}
else if(set2.contains(sum))
{
break;
}
else
{
if(sum==1)
{
set1.addAll(al);
System.out.println(i);
//count++;
al.clear();
break;
}
else
{
if(al.contains(sum))
{
set2.addAll(al);
al.clear();
break;
}
else
al.add(sum);
}
}
n=sum;
}
}
//System.out.println(count);
t--;
}
}
}
