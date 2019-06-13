import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int temp,p;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<(n-i-1);j++)
                {
                if(height[j]<height[j+1])
                    {
                    temp=height[j];
                    height[j]=height[j+1];
                    height[j+1]=temp;
                }
            }
            }
        int k1=k;
        for(int i=0;i<n;i++)
            {
            if(height[i]>k)
                {
                p=height[i]-k;
                k=k+p;
            }
        }
        System.out.println(k-k1);
        // your code goes here
    }
}
