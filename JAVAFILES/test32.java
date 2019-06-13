import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test32 {

     static boolean prime1[] = new boolean[1000001];
      static ArrayList<Integer> al=new ArrayList<Integer>();
      public static void prime()
    {
        for(int i=0;i<1000001;i++)
            prime1[i] = true;
         
        for(int j = 2; j*j <=1000000; j++)
        {
            if(prime1[j] == true)
            {
                for(int i = j*j; i <= 1000000; i += j)
                    prime1[i] = false;
            }
        }
        for(int i=2;i<=1000000;i++)
        {
        	if(prime1[i])
        		al.add(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prime();
        System.out.println(al);
        int arr[][]=new int[261][261];
        for(int i=0;i<261;i++)
        {
        	Arrays.fill(arr[i],0);
        }

    int i, k = 0, l = 0;
    int len=al.size()-1;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
          int n=261,m=261;
        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
            	arr[k][i]=al.get(len);
            	len--;
            }
            k++;
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i)
            {
            	arr[i][n-1]=al.get(len);
            	len--;
            }
            n--;
  
            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                	arr[m-1][i]=al.get(len);
                	len--;      
                }
                m--;
            }
  
            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                	arr[i][l]=al.get(len);
                	len--;
                }
                l++;    
            }        
        }

        int num=sc.nextInt();
        while(num>0)
        {
        	String s=sc.next();
        	int a1=Integer.parseInt(s.substring(0,1));
        	int a2=Integer.parseInt(s.substring(2,3));
        	System.out.println(arr[260][260]);
        	num--;
        }
    }
}

    