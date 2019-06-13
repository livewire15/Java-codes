import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String a[]=new String[q];
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
        
          if(Math.abs(x-z)<Math.abs(y-z))
            a[a0]="Cat A";
          else if(Math.abs(x-z)==Math.abs(y-z))
            a[a0]="Mouse C";
          else
            a[a0]="Cat B";              
        } 
        for(int i=0;i<q;i++)
            {
            System.out.println(a[i]);
        }
    }
}
