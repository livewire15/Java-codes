 
 import java.util.*;
 class insertion_shift
 {
 public static void main(String args[])
 {
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 
 int i=1,t=0,shift=0;   //i starting from 1st index coz 0th index is already sorted.
 while(i<a.length)
 {
 int j=i-1;
  int k=i;  //creating copy of variable i.
 while(j>=0)
 {
 if(a[k]>=a[j])
 ;
 else
 {
 t=a[k];     //swapping
 a[k]=a[j];
 a[j]=t;
 shift++;
 k--;
 }
 j--;
 } 
 i++;
 } 
 System.out.println(shift);
 }
 }
 
 