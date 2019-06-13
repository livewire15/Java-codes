import java.util.*;
class cc 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        n=n-1;
        m=m-1;
        
        if((n%a==0 && m%b==0)||((n>0 && m>0) && ((n-1)%a==0 && (m-1)%b==0)))
            System.out.println("Chefirnemo");
        else
            System.out.println("Pofik");
    }
}
}