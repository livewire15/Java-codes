import java.util.*;
import java.text.DecimalFormat;
 class prob_decimal
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t>0)
 {
 int n=sc.nextInt();
  int a=sc.nextInt();
   int b=sc.nextInt();
   int arr[]=new int[n];
   int count_a=0,count_b=0;
   for(int i=0;i<n;i++)
   {
   arr[i]=sc.nextInt();
   if(arr[i]==a)
   count_a++;
   if(arr[i]==b)
   count_b++;
   }
   float prob=((float)count_a/(float)n)*((float)count_b/(float)n);
   DecimalFormat df=new DecimalFormat("#.0000000000");
   System.out.println(df.format(prob));
   t--;
 }
 }
 }