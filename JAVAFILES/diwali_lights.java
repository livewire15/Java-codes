import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class diwali_lights {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
			int n=sc.nextInt();
            BigInteger bg=new BigInteger("2");
			//BigInteger bg2=BigInteger.valueOf(n);
			BigInteger bg1=bg.pow(n);
			BigInteger bg3=new BigInteger("1");
			BigInteger bg4=new BigInteger("100000");
			System.out.println((bg1.subtract(bg3)).mod(bg4));
			
        }
    }
}