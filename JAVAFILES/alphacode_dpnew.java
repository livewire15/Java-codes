import java.util.*;
class alphacode_dpnew
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
int l=(int)Math.log10(n)+1;
int arr[]=new int[l+1];
int ans=code(n,arr,l);
System.out.println(ans);
}

static int code(long n,int arr[],int l)
{
arr[0]=1;
arr[1]=1;
int i;
for(i=2;i<=l;i++)
{
arr[i]=arr[i-1];
int temp=(int)(n/(long)Math.pow(10,l-i));
if(temp%100<=26)
	arr[i]+=arr[i-2];
}
return arr[i-1];
}
}