import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(str.charAt(0)=='0')
	System.exit(0);
int l=str.length();
long arr[]=new long[l+1];
long ans=code(str,arr,l);
System.out.println(ans%(1000000000+7));
}

static long code(String str,long arr[],int l)
{
if(l==0 || l==1)//means if number is of size 1 or 0 then
return 1;

if(arr[l]>0)
	return arr[l];
else
{
  long output=0;
if(str.charAt(l-1)!='0')
	output+=code(str.substring(0,l-1),arr,l-1);
if(l>1)//means if number of size 2 exists then
{
String ch1=str.substring(l-2);
int ch=Integer.valueOf(ch1);
if(ch<=26)//taking out the last 2 digits
	output+=code(str.substring(0,l-2),arr,l-2);
}
arr[l]=output%(1000000000+7);//storing the output in array for dp
return output%(1000000000+7);
}
}
}