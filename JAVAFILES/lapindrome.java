import java.util.*;
class lapindrome
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
String s=sc.next();
int l=s.length();
if(l%2==0)
{
String s1=s.substring(0,l/2);
String s2=s.substring(l/2,l);
String s3="";
String s4="";
for(char ch='a';ch<='z';ch++)
{
for(int j=0;j<s1.length();j++)
{
if(ch==s1.charAt(j))
s3=s3+ch;
if(ch==s2.charAt(j))
s4=s4+ch;
}
}
if(s3.equals(s4))
System.out.println("YES");
else
System.out.println("NO");
}

else
{
String s1=s.substring(0,(int)Math.floor(l/2));
String s2=s.substring((int)Math.floor(l/2)+1,l);
String s3="";
String s4="";
for(char ch='a';ch<='z';ch++)
{
for(int j=0;j<s1.length();j++)
{
if(ch==s1.charAt(j))
s3=s3+ch;
if(ch==s2.charAt(j))
s4=s4+ch;
}
}
if(s3.equals(s4))
System.out.println("YES");
else
System.out.println("NO");
}

}
}
}