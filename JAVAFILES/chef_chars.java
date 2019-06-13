import java.util.*;
class chef_chars
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();

while(t>0)
{
int count=0;
int i2=4,i1=0;
String s=sc.next();
while(i2<=s.length())
{
String ch=s.substring(i1,i2);
char arr[]=ch.toCharArray();
Arrays.sort(arr);
String ch2=String.valueOf(arr);
if(ch2.equals("cefh"))
count++;

i1++;
i2++;
}
if(count>0)
System.out.println("lovely"+" "+count);
else
System.out.println("normal");
t--;
}
}
}
