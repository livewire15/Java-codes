import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    static String onceInATram(int x) {
        // Complete this function
        String xs="";
        while(x>0)
        {
            x++;
           xs=Integer.toString(x);
            int f=0,e=0;
            f=(int)xs.charAt(0)+(int)xs.charAt(1)+(int)xs.charAt(2);
            e=(int)xs.charAt(3)+(int)xs.charAt(4)+(int)xs.charAt(5);
            if(f==e)
                break;
        }
        return xs;
        
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    String result = onceInATram(x);
    System.out.println(result);
    }
}

