import java.util.*;
public class Solution {
    public int solve(String A) {
        ArrayList<Integer> al=new ArrayList<>();
        int l=A.length();
        char ch=A.charAt(0);
        int ans=0;
        for(int i=1;i<l;i++)
        {
            if(ch==A.charAt(i))
                al.add(i);
        }
        int s=al.size();
        Collections.sort(al,Collections.reverseOrder());
        int f=0;
        for(int i=0;i<s;i++)
        {f=1;
            String tmp=A.substring(0,al.get(i)+1);
            if(palin(tmp))
            {
                ans=l-al.get(i)-1;
                break;
            }
            else
            {
                ans=l-1;
            }
        }
        if(f==0)
        ans=l-1;
        return ans;
    }
    
    public static boolean palin(String tt)
    {
        int n=tt.length()-1,i=0,flag=0;
       while(i<=n)
       {
           if(tt.charAt(i)!=tt.charAt(n))
           {
               flag=-1;
               break;
           }
           i++;
           n--;
       }
       if(flag==0)
        return true;
       return false;
    }
}
