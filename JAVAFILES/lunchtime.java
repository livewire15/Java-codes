import java.util.*;
 class lunchtime
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int count=0;
 for(int i=0;i<n;i++)
 {
 String s=sc.next();
 if(s.contains("ch") || s.contains("he") || s.contains("ef") || s.contains("che") || s.contains("hef") || s.contains("chef"))
 count++;
 }
 System.out.println(count);
 }
 }