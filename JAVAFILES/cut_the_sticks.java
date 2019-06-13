import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cut_the_sticks
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
         Arrays.sort(arr);
        int p,t=0;
        System.out.println(n);
        while(t<n-1)
      {
            p=0;
        int min=arr[t];
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>0)
            {
            arr[j]=arr[j]-min;
            if(arr[j]!=0)
                p++;
            else
                t++;
        }
        }
		if(p!=0)
            System.out.println(p);
        }
    }
}
