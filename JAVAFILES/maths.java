import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class maths {

    /*
     * Complete the closestNumber function below.
     */
    static long closestNumber(int a, int b, int x) {
        /*
         * Write your code here.
         */
        int num=(int)Math.pow(a,b);
		//System.out.println(num);
        int v1=(int)Math.floor((float)num/(float)x);
		//System.out.println(v1);
        int v2=(int)Math.ceil((float)num/(float)x);
		//System.out.println(v2);
        long n1=(long)x*(long)v1-num;
		//System.out.println(n1);
        long n2=(long)x*(long)v2-num;
		//System.out.println(n2);
        if((int)Math.abs(n1)<=(int)Math.abs(n2))
            return (long)x*(long)v1;
        else
            return (long)x*(long)v2;
    }

    

    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
      while(t>0)
	  {
		  int a=scanner.nextInt();
		  int b=scanner.nextInt();
		  int x=scanner.nextInt();
		  System.out.println(closestNumber(a,b,x));
		  t--;
	  }
}
}