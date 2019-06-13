import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int p=0;
        for(char ch='a';ch<='z';ch++)
      {          
        for(int i=0;i<s.length();i++)
            {
            if(ch==s.charAt(i))
         {  
                p++;
                break;   
        }  
    }
}
	  
        if(p==26)
            {
            System.out.println("pangram");            
        }
        else
               System.out.println("not pangram"+p);
    }
}
