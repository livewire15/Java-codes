import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grid_challenge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{   
	        int flag=0;
			int n=sc.nextInt();
			char c;
			char a[][]=new char[n][n];
			for(int k=0;k<n;k++)
			{
           	String s=sc.next();
			for(int j=0;j<n;j++)
			{
				a[k][j]=s.charAt(j);
			}
			for(int x=0;x<n;x++)
			{
				for(int y=0;y<n-1;y++)
				{
					if(a[k][y]>a[k][y+1])
					{
						c=a[k][y];
						a[k][y]=a[k][y+1];
						a[k][y+1]=c;
					}	
				}
			}
			}

			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n-1;k++)
				{
					if(a[k][j]>a[k+1][j])
					{
						flag=-1;
						break;
					}
				}
				if(flag==-1)
					break;
			}
			if(flag==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}
}
		