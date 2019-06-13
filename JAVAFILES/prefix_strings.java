import java.util.*;
 public class prefix_strings
 {
	 static int max=0;
 static String common="";
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 String arr[]=new String[n];
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.next();
 }
 int q=sc.nextInt();
 String query[]=new String[q];
 int query_int[]=new int[q];
 for(int i=0;i<q;i++)
 {
 query_int[i]=sc.nextInt();
 query[i]=sc.next();
 }

 for(int j=0;j<q;j++)
 {
 max=0;
 common="";
 String ans=prefix(query[j],query_int[j],arr);
 System.out.println(ans);
 }
 }
 
  static String prefix(String a,int value,String arr[])
 {
 String org_strings[]=new String[value];
 for(int j=0;j<value;j++)
 {
 org_strings[j]=arr[j];
 }
 Arrays.sort(org_strings);
 for(int j=0;j<value;j++)
 {
 String b=org_strings[value-j-1];
 int i=0;
 while(i<a.length() && i<b.length())
 {
 if(a.charAt(i)==b.charAt(i))
 i++;
 else
 break;
 }
 
 if(i>=max)
 {
 max=i;
 common=b;
 }
 }
 return common;
 }
 }