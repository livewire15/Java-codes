import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int hackerlandRadioTransmitters(int[] x, int k,int max) {
        // Complete this function
        int count=0;
        for(int i=1;i<=max;i++)
        {
            if(x[i]==1)
            {
                i=i+k;
                if(i<=max)
              {
                if(x[i]==1)
                {
                    count++;
                    i=i+k;
                }
                else
                {
                    while(x[i]!=1)
                        --i;
                    count++;
                    i=i+k;
                }
              }
                else
                {
                    count++;
                    break;
            }
        }
      }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[100001];
        Arrays.fill(x,0);
        int max=0;
        for(int x_i = 0; x_i < n; x_i++){
            int num=in.nextInt();
            if(num>max)
                max=num;
           x[num]=1;
        }
        int result = hackerlandRadioTransmitters(x, k,max);
        System.out.println(result);
        in.close();
    }
}
