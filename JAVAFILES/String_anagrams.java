import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
            {
            int h=0;
            String s=sc.next();
            int l=s.length();
            if(l%2==0)
                {
                String s1=s.substring(0,l/2);
                String s2=s.substring(l/2,l);
                StringBuilder sb=new StringBuilder(s2);
                for(int i1=0;i1<s1.length();i1++)
                    {
                    int p=0;
                    char ch1=s1.charAt(i1);
                    for(int j=0;j<s2.length();j++)
                        {
                        char ch2=sb.charAt(j);
                        if(ch1==ch2)
                         {
                            p++;
                            sb.setCharAt(j,'*');
                            break;
                        }
                    }
                    if(p==0)
                        h++;                                           
                }
                  a[i]=h;
            }
            else
                a[i]=-1;
        }
        for(int k=0;k<t;k++)
            {
            System.out.println(a[k]);
        }
    }
}