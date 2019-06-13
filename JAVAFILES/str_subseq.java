import java.util.*;
class str_subseq
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
	int p=0;
String s=sc.next();
int a[]=new int[123];
for(int j=97;j<123;j++)
{
	a[j]=0;
}
for(int j=0;j<s.length();j++)
{
if(a[(int)s.charAt(j)]==0)
{
	p++;
	a[(int)s.charAt(j)]=1;           /*changing value such that no repedition occurs*/
}
}
System.out.println(p);

}
}
}