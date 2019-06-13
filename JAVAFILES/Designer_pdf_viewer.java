import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max=0;
        int l=word.length();
        for(int j=0;j<l;j++)
            {
            char ch=word.charAt(j);
            int p=(int)ch;
            p=p-97;
            if(h[p]>max)
                max=h[p];
        }
        System.out.println(max*l);
    }
}
