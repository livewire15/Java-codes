import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[]=new int[t];
        for(int a0 = 0; a0 < t; a0++){
             a[a0] = in.nextInt();
        }
        int p,h;
        for(int j=0;j<t;j++)
            { 
            p=0;h=1;
            while(p<a[j])
                {
                if(p%2==0)
                    h=h*2;                   
                else
                   h=h+1; 
                p++;
            }
            System.out.println(h);
        }
    }
}
