import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        double s;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
            {
            int p=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=(int)Math.ceil(Math.sqrt(a));
            int b1=(int)Math.floor(Math.sqrt(b));
            
            System.out.println(b1-a1+1);
        }
    }
}