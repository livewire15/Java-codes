import java.io.*;
import java.util.*;

public class test2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int j=0;
        int f[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int diff=(Math.abs(a[1]-a[0]));
        for (int i=1;i<n-1;i++)
        {
            if (Math.abs(a[i+1]-a[i])<diff)
            {
                diff=(Math.abs(a[i+1]-a[i]));
            }
        }
        
		Arrays.fill(f,10000000);
        for(int i=1;i<n-1;i++)
        {
            
            if (diff==Math.abs(a[i+1]-a[i]))
            {
               
                f[j]=a[i+1];
                
                f[j+1]=a[i];
                j+=2;
            }
        }
        Arrays.sort(f);
       // int size=f.length;
        //System.out.println(size);
        for(int i=0;i<j;i++)
        {
            System.out.print(f[i]+" ");
        }
    }
}