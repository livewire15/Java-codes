import java.util.*;
class subsequences_optimized
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String output="";
subs(s,output);
}

static void subs(String s,String output)
{
if(s.length()==0)
{
	System.out.println(output);
	return;
}
else
{
subs(s.substring(1),output);
subs(s.substring(1),output+s.charAt(0));
}
}
}