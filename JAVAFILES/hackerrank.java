import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrank {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
        String s = in.next();
        String str="hackerrank";
        int p=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==str.charAt(p))
            {  
                ++p;
                if(p==10)
                {
                    System.out.println("YES");
                    break;

                }
            }

        }
            if(p<10)
            System.out.println("NO");

    }
}
}
