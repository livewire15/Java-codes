import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class save_the_prisoner {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a=sc.nextInt();
            
            while(m>0)
                {
            if(m>(n-a+1))
                {
                m=m-(n-a+1);
                a=1;
            }
            else
                {
                a=a+m-1;
                m=0;
            }
            }
               
                System.out.println(a);
        }
    }
}
  