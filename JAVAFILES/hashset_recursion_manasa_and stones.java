import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static HashSet<Integer> stones(int n, int a, int b) {
        // Complete this function
        if(n==0 || n==1)
        {
            HashSet<Integer> set=new HashSet<Integer>();
            set.add(0);
            return set;
        }
        else
        {
           HashSet<Integer> hs=stones(n-1,a,b);            
            HashSet<Integer> set=new HashSet<Integer>();
            Iterator<Integer> itr=hs.iterator();
            while(itr.hasNext())
            {
                int ele=itr.next();
                set.add(ele+a);
                set.add(ele+b);
            }
            return set;
        }      
      }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            HashSet<Integer> hs = stones(n, a, b);
            List<Integer> ls=new ArrayList<Integer>(hs);
            Collections.sort(ls);
            Iterator<Integer> itr=ls.iterator();
            while(itr.hasNext())
            {             
                    System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
