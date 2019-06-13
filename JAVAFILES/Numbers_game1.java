import java.util.*;
public class Numbers_game1
{
public static void main(String args[])
{
int n,p=0;
String s1="",s2="";
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
s1=sc.next();
for(int i=0;i<(n-1);i++)
{
s2=sc.next();
if(s1.charAt(21)!=s2.charAt(0))
p++;
s1=s2;
}
System.out.print(p);
}
}