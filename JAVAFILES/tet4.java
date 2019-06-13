import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	String arr[]=new String[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.next();
    	}
        int sum=0,p=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                sum+=(int)arr[i].charAt(j)-48;
            }
            if(sum%3==0)
            {
                p++;
            }
            sum=0;
        }
        System.out.println(p);
    }
}