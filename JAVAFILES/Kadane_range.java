//Program to return the range containing maximum 1's.
public class Solution {
    public int[] flip(String A) {
        int start=0,end=0;
        int one=0,left=0;
        int max=Integer.MIN_VALUE;
        int f=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='0')
              {
                  f=-1;
                  break;
              }
        }
        if(f==-1)
        {
            for(int i=0;i<A.length();i++)
            {
                if(A.charAt(i)=='0')
                    one++;
                else 
                    one--;
                    
                if(one>max)
                {
                    max=one;
                    start=left;
                    end=i;
                }
                if(one<0)
                {
                    one=0;
                    left=i+1;
                }
            }
            int ans[]=new int[2];
            ans[0]=start+1;
            ans[1]=end+1;
            return ans;
        }
        else
        {
            int ans[]={};
            return ans;
        }
    }
}
