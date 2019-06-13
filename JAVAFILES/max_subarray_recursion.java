import java.util.*;
 class max_subarray
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println(subarray(n,arr,0,0));
 }
 
 static int subarray(int n,int arr[],int sum,int max)
 {
for(int i=0;i<n;i++)
{
	sum+=arr[i];
	if(sum>max)
		max=sum;
	if(sum<0)
		sum=0;
}
return max;
 }
 }