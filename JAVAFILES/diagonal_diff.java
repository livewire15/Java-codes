import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s1=0,s2=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
            for(int i=0;i<n;i++)
                {
                for(int j=0;j<n;j++)
                    {
                    if(i==j)
                        s1=s1+a[i][j];
                    if(i+j==(n-1))
                        s2=s2+a[i][j];
                }
            }
            if(s1>s2)
                System.out.println(s1-s2);
            else
                 System.out.println(s2-s1);
        
    }
}
