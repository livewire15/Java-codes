import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dynamic_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][0];
		
         int q=sc.nextInt();
        int last_ans=0;
        for(int i=0;i<q;i++)
        {
             int a=sc.nextInt();
             int x=sc.nextInt();
             int y=sc.nextInt();
			 int k=0;
            if(a==1)
            {
                int index=(x^last_ans)%n;
				int oned[]=new int[arr[index].length];
				for(int j=0;j<arr[index].length;j++)
				{
					oned[j]=arr[index][j];
				}
				arr[index]=new int[arr[index].length+1];
				for(k=0;k<oned.length;k++)
				{
					arr[index][k]=oned[k];
				}  
                arr[index][k]=y;           
            }
            else if(a==2)
            {
                int index=(x^last_ans)%n;
                int val=y%arr[index].length;
                last_ans=arr[index][val];
                System.out.println(last_ans);
            }
        } 

    }
}