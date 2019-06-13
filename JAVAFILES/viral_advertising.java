import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=5,s=0;
        for(int i=0;i<n;i++)
            {
            s+=Math.floor(m/2);
            m=(int)Math.floor(m/2);
            m=m*3;
        }
        System.out.println(s);
    }
}