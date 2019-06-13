import java.util.*;
 class daily_train
 {
 public static void main(String args[])
 {
 int x,n;
 Scanner sc=new Scanner(System.in);
 x=sc.nextInt();
 n=sc.nextInt();
 me obj=new me();
 String a[]=new String[n];
 for(int i=0;i<n;i++)
 {
 a[i]=sc.next();
 }
 int val=0;
for(int i=0;i<n;i++)
 {
 int k=0,p=53;
 String s=a[i];
 for(int j=0;j<9;j++)//loop for 9 compartments
 {
 int count=0;
 while(k<(4+4*j))
 {
 if((int)s.charAt(k)==48)//checking for zero from beginning
 count++;
 k++;
 }
  
 while(p>=(52-2*j))
 {
 if((int)s.charAt(p)==48)//checking for zero from last
 count++;
 p--;
 }

 if(count>=x)
 {
	 int per=me.fact(count)/(me.fact(x)*me.fact(count-x));//calculating no.of ways
	 val=val+per;
 }
}
}
System.out.println(val); 
 }
 }
 
 class me
 {
    public static int fact(int n) 
	{
        int f = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}

 