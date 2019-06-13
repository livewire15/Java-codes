import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlock_beast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
			int flag=0;
			if(n>2)
			{
			int p=0;
			if(n%27==0)
			{
			String number="";
			int r=n/27;
			while(r>0)
			{
		    number+="555555555555555555555555555";  
			r--;
			}
			BigInteger bg1=new BigInteger(number);
			System.out.println(bg1);
			}
			else if(n%3==0)//if divisible by 3 then simply string will be in multiples of 5.
			{
			String number="";
			int r=n/3;
			while(r>0)
			{
		    number+="555";  
			r--;
			}
			BigInteger bg1=new BigInteger(number);
			System.out.println(bg1);
			}
			
			else
			{//we have to look for the greatest possible no. which will always start with 5(5>3).
			int a=n;
			String number="";
			while(a%3!=0 && a>=3)
			{
			a=a-5;
			}
			
			if(a%27==0)
			{
			flag=1;
			int r=a/27;
			for(int k=0;k<r;k++)
			{
			number+="555555555555555555555555555";
			}
			r=(n-a)/5;
			for(int j=0;j<r;j++)
			{
			number+="33333";
			}
			}
			else if(a%3==0)
			{
			flag=1;
			int r=a/3;
			for(int k=0;k<r;k++)
			{
			number+="555";
			}
			r=(n-a)/5;
			for(int j=0;j<r;j++)
			{
			number+="33333";
			}
			}
			
			if(flag==1)
			{
			BigInteger bg3=new BigInteger(number);
			System.out.println(bg3);
			}
			else
			System.out.println(-1);
			}
			}
			else
			System.out.println(-1);
		
    }
}
}
