import java.util.*;
class test15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int l=sc.nextInt();
int r=sc.nextInt();
int count=0;
for(int i=l;i<=r;i++)
{
	if(i==2 || i==3 || i==9)
		count++;
	else
	{
if(i%10==2 || i%10==3 || i%10==9)
 count++;
 }
}
 System.out.println(count);
 t--;
 }
 }
 }
 