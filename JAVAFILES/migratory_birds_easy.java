import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max=0,type=0;
        for(int types_i=0; types_i < n; types_i++){
            a[types_i] = in.nextInt();
        }
        // your code goes here
        for(int i=1;i<=5;i++)
            {
            int p=0;
          for(int j=0;j<n;j++)
          {
              if(a[j]==i)
              p++;
        }
            if(p>max)
                {
                max=p;
                type=i;
    }
}
        System.out.print(type);
    }
}
        
