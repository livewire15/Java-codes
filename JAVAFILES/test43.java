import java.util.*;
class test43 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int num=(int)Math.ceil((int)Math.log(n));
        int ans=0;
        if(num>3)
        {
            int a=n%1000;
            int b=n/1000;
            if(a<333)
            {
                ans=b*1000+333;
            }
            else
            {
                b=b+1;
                ans=b*1000+333;
            }
        }
        else if(num==3)
        {
            if(num<333)
                ans=333;
            else
                ans=1333;
        }
        else
        {
            ans=333;
        }

        System.out.println(ans);
}
}
}