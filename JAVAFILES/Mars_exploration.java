import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class mars_exploration{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        int p=0;
        String s1="";
        int n=(s.length()/3);
        for(int i=0;i<n;i++)
            {
            s1=s1+"SOS";
        }
        for(int j=0;j<s.length();j++)
            {
            if(s.charAt(j)!=s1.charAt(j))
                p++;
        }
        System.out.println(p);
    }
}
