import java.util.*;
 class chotu_motu
 {
 public static void main(String args[])
 {
int t;
 Scanner sc=new Scanner(System.in);
 t=sc.nextInt();
 for(int i=0;i<t;i++)
 {
 int p=0,m=0;
 String s1="";
 String s=sc.next();
 int l=s.length();
 int min=(int)Math.floor(l/2);
  int a[]=new int[l];
  Arrays.fill(a,0);
  
 for(int j=0;j<s.length();j++)
 {
 if(l%2==0)
 {
 p=l/2;
 p=p-1;
 }
 else
 {
 p=(int)Math.floor(l/2);
 }
 
 if(a[p]==0)
 ;
 else
 {
	 if(s.length()%2==0)
		 p=p+1+2*m;
	 else
         p=p+2+2*m;
 m++;
 }
 
 a[p]=1;
 
 if(s.length()%2==0)
 {
 if(p>=min)
s1=s1+s.charAt(j);
else
s1=s.charAt(j)+s1;	
 }
 else
 {
 if(p>min)
 s1=s1+s.charAt(j);
 else
 s1=s.charAt(j)+s1;
 }
 l--;
 }
 System.out.println(s1);
 }
 }
 }
 
 
 