import java.util.*;
 class chotu_motu1
 {
 public static void main(String args[])
 {
int t;
 Scanner sc=new Scanner(System.in);
 t=sc.nextInt();
 for(int i=0;i<t;i++)
 {
 String s1="";
 String s=sc.next();
 for(int j=0;j<s.length();j++)
 {
	 if(s.length()%2==0)
	 {
 if(j%2==0)
s1=s.charAt(j)+s1;
 else
 s1=s1+s.charAt(j);
	 }
	 else
	 {
 if(j%2==0)
 s1=s1+s.charAt(j);
 else
 s1=s.charAt(j)+s1;
 }
 }
 System.out.println(s1);
 }
 }
 }