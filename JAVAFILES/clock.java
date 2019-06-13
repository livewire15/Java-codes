import java.util.*;
class clock
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int p=sc.nextInt();
int q=sc.nextInt();
int n=sc.nextInt();
float sum=(float)p/q;
System.out.println(sum);
int count=0,val=0;
float clock1=12,clock2=12;
while(count<2)
{
	if(clock1==clock2)
{
val++;
}
clock1+=1;
clock2+=sum;
if(clock1>=24)
{
clock1=clock1-12;
count++;
}
if(clock2>=24)
{
clock2=clock2-12;
}
}
int ans=(int)Math.ceil(n/val);
System.out.println(ans);
t--;
}
} 
}