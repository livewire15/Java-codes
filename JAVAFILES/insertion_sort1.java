import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class insertion_sort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
        int l=ar.length,e,p=0;
        e=ar[l-1];
        l=l-2;
        while(l>=0)
            {
            if(ar[l]>e)
             {
                ar[l+1]=ar[l];
                for(int i=0;i<ar.length;i++)
                    {
                   System.out.print(ar[i]+" ");
                }
                System.out.println();
            }
            else
            {
                ar[l+1]=e;
                for(int i=0;i<ar.length;i++)
                    {
                   System.out.print(ar[i]+" ");
                }
                System.out.println();
                p=1;
                break;
            }
            l--;
        }
        
        if(p==0)
            {
            ar[0]=e;
            for(int i=0;i<ar.length;i++)
                    {
                   System.out.print(ar[i]+" ");
                }
                System.out.println();
        }
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
}

 
