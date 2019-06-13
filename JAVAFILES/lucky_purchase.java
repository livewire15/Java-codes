import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int min=1000000001;
       String mins="";
        int flag=0;
        for(int a0 = 0; a0 < t; a0++)
        {
            String s = in.next();
            int n = in.nextInt();
            int number=n;
            int r1=0,r2=0,ptr=0;
            while(n>0)
            {
                int r=n%10;
                if(r==4)
                    r1++;
                else if(r==7)
                    r2++;
                else
                {
                    ptr=1;
                    break;
                }
                n/=10;
            }

            if(r1==r2 && r1>0 && r2>0 && ptr==0)
            {
                flag=1;
                if(number<min)
                {
                    min=number;
                    mins=s;
                } 
            }
        }
        if(flag==1)
          System.out.println(mins);
        else
            System.out.println(-1);
        in.close();
}
}
