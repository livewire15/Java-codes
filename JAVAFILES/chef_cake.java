import java.util.*;
 class chef_cake
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t>0)
 {
 int i=0,j=0;
 int n=sc.nextInt();
 int m=sc.nextInt();
 char arr[][]=new char[n][m];
 char arr2[][]=new char[n][m];
 for(i=0;i<n;i++)
 {
 for(j=0;j<m;j++)
 {
 if((i+j)%2==0)
 {
 arr[i][j]='R';
 arr2[i][j]='G';
 }
 else
 {
 arr[i][j]='G';
 arr2[i][j]='R';
 }
 }
 }
 
 String input[]=new String[n];
 for(i=0;i<n;i++)
 {
input[i]=sc.next();
 }
 
 int sum=0,sum2=0;
 for(i=0;i<n;i++)
 {
 for(j=0;j<m;j++)
 {
 if(arr[i][j]!=input[i].charAt(j) && input[i].charAt(j)=='G')
 sum+=3;
 else if(arr[i][j]!=input[i].charAt(j) && input[i].charAt(j)=='R')
 sum+=5;

 if(arr2[i][j]!=input[i].charAt(j) && input[i].charAt(j)=='G')
 sum2+=3;
 else if(arr2[i][j]!=input[i].charAt(j) && input[i].charAt(j)=='R')
 sum2+=5;
 }
 }
 
 int ans=(sum<sum2)?sum:sum2;
 System.out.println(ans);
 t--;
 }
 }
 }
 
 