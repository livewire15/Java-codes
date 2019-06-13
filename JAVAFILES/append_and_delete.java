import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class append_and_delete {

   public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int k = in.nextInt();
    int index = 0; // the last index of same beginning sub-string
    while(index < Math.min(s.length(), t.length()) && 
          s.charAt(index) == t.charAt(index)) {
        index++;
    }
    String s2 = s.substring(index, s.length());
    String t2 = t.substring(index, t.length());
    int editsNeeded = s2.length() + t2.length(); // appends + deletes
    int kDiff = k - editsNeeded; // leftover operations
    // exact num edits, 
    // even number of left over edits (append then delete nets no change), 
    // or extra edits used for delete on empty string
    if( k == editsNeeded 
       || kDiff > 0 && (kDiff) % 2 == 0 
       || kDiff >= 0 && k - s.length() >= t.length() )
        System.out.println("Yes");
    else System.out.println("No");
}
}
