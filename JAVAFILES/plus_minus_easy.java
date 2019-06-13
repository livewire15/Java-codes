import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p1=0,p2=0,p3=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]>0)
                p1++;
            else if(arr[i]<0)
                p2++;
                else
                p3++;
               
        }
        System.out.println((float)p1/n);
        System.out.println((float)p2/n);
        System.out.println((float)p3/n);
        
    }
}
