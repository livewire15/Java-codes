import java.util.*;
class subsequences_special
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
String s=sc.next();
String output="";
String arr[]=new String[1000000];
int ap[]={0};
subs(s,output,arr,ap);
String arr2[]=new String[ap[0]];
for(int i=0;i<ap[0];i++)
{
	arr2[i]=arr[i];
}
Arrays.sort(arr2);
System.out.println(ap[0]-1);
for(int i=1;i<ap[0];i++)
{
	System.out.print(arr2[i]+" ");
}
System.out.println();
t--;
}
}

static void subs(String s,String output,String arr[],int ap[])
{
if(s.length()==0)
{
	arr[ap[0]++]=output;
	return;
}
else
{
subs(s.substring(1),output,arr,ap);
subs(s.substring(1),output+s.charAt(0),arr,ap);
subs(s.substring(1),output+Character.toUpperCase(s.charAt(0)),arr,ap);
}
}
}