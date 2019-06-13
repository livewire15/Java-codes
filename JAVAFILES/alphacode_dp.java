import java.util.*;
class alphacode_dp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
if(n==0)
	System.exit(0);
int l=(int)Math.log10(n)+1;
int arr[]=new int[l+1];
int ans=code(n,arr,l);
System.out.println(ans);
}

static int code(long n,int arr[],int l)
{
if(l==0 || l==1)//means if number is of size 1 or 0 then
return 1;

if(arr[l]>0)
	return arr[l];
else
{
int output=code(n/10,arr,l-1);
//output+=1;
if(l>1)//means if number of size 2 exists then
{
if(n%100<=26)//taking out the last 2 digits
	output+=code(n/100,arr,l-2);
}
arr[l]=output;//storing the output in array for dp
return output;
}
}
}