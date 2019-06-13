import java.io.*;
import java.util.*;
class strhkrrank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.next();
for(int i=0;i<s.length;i++)
{
char ch1=s.charAt(i);
if(ch1=='h')
h++;
else if(ch1=='a')
a++;
else if(ch1=='c')
c++;
else if(ch1=='k')
k++;
else if(ch1=='e')
e++;
else if(ch1=='r')
r++;
else if(ch1=='t')
t++;
}
while(h>1 && a>1 && c>0 && k>0 && e>1 && r>1 && t>0)
{
x++;
h--;
a--;
c--;
k--;
e--;
r--;
t--;
}
}
}