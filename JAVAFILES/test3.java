import java.io.*;
import java.util.*;

public class weighted{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int n=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int arr2[]=new int[n];
        int p=1,j=0;
        char ch='\0';
        for(j=0;j<s.length()-1;j++)
        {
            p=1;            
            if(s.charAt(j)!=s.charAt(j+1))
            {
                if(p==1)
                {
                    al.add(arr[(int)s.charAt(j)-97]);
                }
                else
                {
                    while(p>0)
                    {
                       al.add(arr[(int)ch-97]*p); 
                        p--;
                    }
                }
            }
            else
            {
                p++;
                ch=s.charAt(j);
            }
        }
        if(p==0)
        {
            al.add(arr2[(int)s.charAt(j)-97]);
        }
        else
        {
            while(p>0)
                    {
                       al.add(arr[(int)ch-97]*p); 
                        p--;
                    }
        }
       
        for(int i=0;i<n;i++)
        {
           arr2[i]=sc.nextInt();
            if(al.contains(arr2[i]))
                System.out.println("YES");
            else
                System.out.println("No");
        }
        
    }
}