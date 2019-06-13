import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class abbreviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            int flag=0;
            String a = in.next();
            String b = in.next();
        int n1=a.length();
        int n2=b.length();
        n2--;
        n1--;
       while(n2>0 && n1>0)
       {
           if(a.charAt(n1)==b.charAt(n2))
           {
               n1--;
               n2--;
           }

          if(Character.isLowerCase(a.charAt(n1)))
          {
                 if(a.charAt(n1)-b.charAt(n2)==32)
                {
                    a=a.substring(0,n1)+Character.toUpperCase(a.charAt(n1))+a.substring(n1+1);
                    n1--;
                    n2--;
                }
                else
                {
                    a=a.substring(0,n1)+a.substring(n1+1);
                    n1--;
                }              
           }
           else
           {
               flag=-1;
               break;
           }
       }
        
		//System.out.println("a="+a);
		
     if(flag==-1)
         System.out.println("NO");
        else
        {
            if(n2<0 && n1>=0)
            { 
                int f=0;
                for(int j=0;j<=n1;j++)
                {
                    if(Character.isUpperCase(a.charAt(j)))
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(n1<0 && n2>=0)
                 System.out.println("NO");
            else if(n1<0 && n2<0)
                 System.out.println("YES");               
        }
    }
}
}
