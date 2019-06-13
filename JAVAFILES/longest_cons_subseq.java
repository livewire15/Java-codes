import java.util.ArrayList;
import java.util.*;

public class longest_cons_subseq {

	public static ArrayList<Integer> longestSubsequence(int[] arr){
		// Write your code here
      HashSet<Integer> set=new HashSet<Integer>();
      for(int i=0;i<arr.length;i++)
      {
        set.add(arr[i]);
      }
      int t=1,count=1,max=1;
      
      ArrayList al=new ArrayList();
      ArrayList al1=new ArrayList();
      for(int i=0;i<arr.length;i++)
      {
        t=1;count=1;
        al.clear();
        while(set.contains(arr[i]+t))
        {
          al.add(arr[i]+t);
          t++;
          count++;
		}
       if(count>max)
       {
         al.add(arr[i]);
         al1=al;
         max=count;
       }
      }
      return al1;
	}
}
