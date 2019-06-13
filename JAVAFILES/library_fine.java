import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class library_fine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
		int fine=0;
		
		if(y1<y2)
		fine=0;
	else if(y1>y2)
		fine=10000;
	else
	{
		if(m1<m2)
		fine=0;
		else if(m1>m2)
		fine=500*Math.abs(m1-m2);
	else
	{
		if(d1<=d2)
		fine=0;
		else 
		fine=15*Math.abs(d1-d2);	
	}
	}		
		System.out.println(fine);
    }
}
