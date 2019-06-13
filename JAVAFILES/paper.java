import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class paper {

    static long solve(int n, int m){
        // Complete this function
       long num=(long)n*(long)m;
	   System.out.println(num);
	   return num-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long result = solve(n, m);
        System.out.println(result);
    }
}
