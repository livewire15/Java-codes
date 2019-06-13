import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int index=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
            {
            if(a[j]==x)
            {
                index=j;
                break;
        }
    }
        System.out.println(index);
    }  
}