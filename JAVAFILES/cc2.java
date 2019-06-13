import java.util.*;
class cc2 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
    	int x=sc.nextInt();
    	int s=sc.nextInt();
    	int max=x;
    	for(int i=0;i<s;i++)
    	{
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		if(a==max)
    			max=b;
    		else if(b==max)
       			max=a;
    	}
    	System.out.println(max);
    }
}
}