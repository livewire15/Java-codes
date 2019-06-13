import java.util.*;
class book_fair_tcs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(fair(n,arr,k,0,0));
}

static int fair(int n,int arr[],int k,int i,int sum)
{
if(i>=n)
{
return sum;
}
else
{
int op1=fair(n,arr,k,i+k+1,sum+arr[i]);
int op2=fair(n,arr,k,i+1,sum);
return Math.max(op1,op2);
}
}
}