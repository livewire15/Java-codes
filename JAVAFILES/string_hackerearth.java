import java.util.*;
class string_hackerearth
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
String a=sc.next();
String b=sc.next();
String b1="";
while(q>0)
{
int index=sc.nextInt();
index=index-1;
char ch[]=b.toCharArray();
ch[index]='1';
b=String.valueOf(ch);
if(b.compareTo(a)>=0)
{
System.out.println("YES");
}
else
System.out.println("NO");
q--;
}
}
}