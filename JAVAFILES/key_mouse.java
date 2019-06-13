import java.util.*;
 class key_mouse
 {
 public static void main(String args[])
 {
 int s,n,m;
 Scanner sc=new Scanner(System.in);
 s=sc.nextInt();
 n=sc.nextInt();
 m=sc.nextInt();
 int a[]=new int[n];
 int b[]=new int[m];
 for(int i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
  for(int i=0;i<m;i++)
 {
 b[i]=sc.nextInt();
 }
 int max=0;
 for(int i=0;i<n;i++)
 {
 for(int j=0;j<m;j++)
 {
 if((a[i]+b[j])>max && (a[i]+b[j])<=s)
{
 max=a[i]+b[j];
 }
 }
 }
 if(max>0)
 System.out.println(max);
 else 
 System.out.println(-1);
 }
 }