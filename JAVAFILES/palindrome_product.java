import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class palindrome_product {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
			int pal=0;
			int pro=0,flag=0;
			for(int i=100;i<1000;i++)
			{
				pro=0;
				for(int j=100;j<1000;j++)
				{
					pro=i*j;
					if(pro<n)
					{
						if(pro>pal)
						{
					if(palindrome(pro))
					{
						pal=pro;
					}					
						}
					}
				else 
						break;
			}
			}
			
			System.out.println(pal);
        }
    }
	
	public static boolean palindrome(int pro)
	{
	int sum=0;
	int n=pro;
	while(pro>0)
	{
	int r=pro%10;
	sum=sum*10+r;
	pro/=10;
	}
	if(sum==n)
		return true;
	return false;
	}
}
