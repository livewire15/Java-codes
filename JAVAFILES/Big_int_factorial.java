import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s=1;
        BigInteger bg=BigInteger.valueOf(1); /*Syntax for bigInteger object creation */
        while(n>0)
            {
            bg=bg.multiply(BigInteger.valueOf(n));
            /* BigIntegers are immutable therefore assigning 'bg' the result */
            /* Multiply and add functions are inbuilt in it */
            n--;
        }
        
        System.out.print(bg);
    }
}
