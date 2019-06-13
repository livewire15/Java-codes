import java.util.*;
 class test4
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t>0)
 {
 int n=sc.nextInt();
 int k=sc.nextInt();
int arr[]=new int[n];
int b[]=new int[n*k];
 for(int i=0;i<n;i++)
 {
 int num=sc.nextInt();
 arr[i]=num;
 }
 int p=0;
 for(int j=0;j<n*k;j++)
 {
 if(p>=n)
	p=0;
 b[j]=arr[p];
 p++;
 }
System.out.println(subarray(n*k,b,0,(long)Integer.MIN_VALUE));
 t--;
}
 }
 
 static long subarray(int n,int arr[],long sum,long max)
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