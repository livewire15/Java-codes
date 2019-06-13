import java.io.*;
import java.util.*;

public class weighted{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int n=sc.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
        {
           arr2[i]=sc.nextInt();
		}
        HashSet<Integer> set=new HashSet<Integer>();
        
        int p=1,j=0;
        char ch='\0';
        for(j=0;j<s.length()-1;j++)
        {            
            if(s.charAt(j)!=s.charAt(j+1))
            {
                if(p==1)
                {
                    set.add(arr[(int)s.charAt(j)-97]);
                }
                else
                {
                    set.add(arr[(int)ch-97]*p); 
					p=1;
                }
            }
            else
            { 
				ch=s.charAt(j);
				set.add(arr[(int)ch-97]*p); 
                p++;      
            }
        }
		
        if(p==1)
        {
            set.add(arr[(int)s.charAt(j)-97]);
        }
        else
        {
           set.add(arr[(int)ch-97]*p);
        }

        for(int j1=0;j1<arr2.length;j1++)
		{
            if(set.contains(arr2[j1]))
                System.out.println("Yes");
            else
                System.out.println("No");
        }  
    }
}