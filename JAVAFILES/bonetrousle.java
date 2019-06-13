import java.util.*;
 class bonetrousle
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 for(int i=0;i<t;i++)
 {
 int n=sc.nextInt();
 int k=sc.nextInt();
 int b=sc.nextInt();
 int arr[]=new int[b];
 int s=0,flag=0;
 int min=b*(b+1)/2;
 
 for(int j1=0;j1<b;j1++)
	{
		arr[j1]=j1+1;
		s=s+arr[j1];
	}
	
 if((n-min)/b==(int)(n-min)/b)
 {
int add=(n-min)/b;
 for(int j=0;j<b;j++)
 {
	 arr[j]+=add;
 if(arr[j]>k)
 {
 flag=-1;
 break;
 }
 s=s+arr[j];
 }
 }
 else
 {
	arr[b-1]+=n-s;
	System.out.print("h"+arr[b-1]);
 }
 
 
 
 if(flag==0)
 {
 for(int l=0;l<b;l++)
 {
 System.out.print(arr[l]+" ");
 }
 System.out.println();
 }
 else
 System.out.println(-1);
 }
 }
 }