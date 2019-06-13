import java.util.*;
 class cons_prime
 {
 
 int isprime(int x)
 {
 int p=1;
 for(int i=2;i<=(int)Math.sqrt(x);i++)
 {
 if(x%i==0)
 {
 p=0;
 break;
 }
 }
 if(p==1)
 return 1;
 else 
 return 0;
 }
 
 public static void main(String args[])
 {
 int x,n;
 cons_prime obj=new cons_prime();
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int count=0;
 for(int i=3;i<=n;i++)
 {
	 int flag=0,s=0;
 if(i>4)
 {
  x=obj.isprime(i);
 if(x==1)
 {
 for(int j=2;j<=i;j++)
{
if(obj.isprime(j)==1)
{
s=s+j;
if(s==i)
{
flag=1;
break;
}
}
}

if(flag==1)
count++;
 }
 }
 }
 System.out.println(count);
 }
 }