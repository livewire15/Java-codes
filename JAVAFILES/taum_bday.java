import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class taum_bday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
		{
		    long cost=0;
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
			if(x<y)
			{
			cost+=b*x;
			if((w*y)<=(w*x+w*z))
			cost=cost+w*y;
			else
			cost=cost+w*x+w*z;
			}
			else
			{
			cost+=w*y;
			if((b*x)<=(b*y+b*z))
			cost+=b*x;
			else
			cost+=b*y+b*z;
			}
			System.out.println(cost);
			}
        }
    }

