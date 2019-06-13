import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            score[scores_i] = in.nextInt();
        }
        int c[]=new int[n];
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        int k=0,p;
        for(int i=0;i<n;i++)
            {
            if(score[i]!=-1)
                {
                p=0;
            for(int j=i+1;j<n;j++)
                {
                  if(score[i]==score[j])
                {
                score[j]=-1;
            }
                else
                    {
                    c[k++]=score[i];
                    p=1;
                    break;
                }
        }
         if(p==0)
        c[k++]=score[i];
    }
}
        
 p=0;
        for(int i=0;i<n;i++)
            {
            for(int j=n-1;j>=0;j--)
           {   
                p=0;
            
                if(c[j]!=0)
             {
                if(alice[i]>c[j])
                    {
                    if(j==0)
                    break;
                    
                    if(alice[i]==c[j-1])
                    {
                        System.out.println(j);
                        p=1;
                        break;
                    }
                    
                   else if(alice[i]<c[j-1])
                    {
                        System.out.println(j+1);
                        p=1;
                        break;
                    }
                continue;
                    }
                        System.out.println(j+2);
                        p=1;
                        break;
                    }
                    }
            if(p==0)
             System.out.println(1);   
        }
}
}
