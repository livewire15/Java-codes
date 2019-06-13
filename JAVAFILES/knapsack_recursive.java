import java.util.*;
 class knapsack
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int val[]=new int[n];
 int wt[]=new int[n];
 for(int i=0;i<n;i++)
 {
 val[i]=sc.nextInt();
 }
 for(int i=0;i<n;i++)
 {
 wt[i]=sc.nextInt();
 }
 int w=sc.nextInt();
 System.out.println(fun(n,val,wt,w,0));
 }
 
 static fun(int n,int val[],int wt[],int w,int sum)
 {
 if(n==0 || w==0)
 return sum;
 else
 {
 if(wt[n-1]<=w)
	int op1=fun(n-1,val,wt,w-wt[n-1],sum+val[n-1]);
 int op2=fun(n-1,val,wt,w,sum);
 return Math.max(op1,op2);
 }
 }
 }