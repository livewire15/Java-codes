import java.util.*;
 class lunchtime1
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 int count=0;
 while(t>0)
 {
 int sum=0;
 count=0;
 int n=sc.nextInt();
 int k=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 sum+=arr[i];
 }
 for(int i=0;i<n;i++)
 {
 if((arr[i]+k)>(sum-arr[i]))
 count++;
 }
 t--;
 System.out.println(count);
 }
 
 }
 }
 