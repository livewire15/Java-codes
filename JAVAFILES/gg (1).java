import java.util.*;
import java.util.ArrayList;

 class ggg
 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ArrayList<Long> al=new ArrayList<>();
            long hh=1000000000;
            for(long i=2;i*i<=1000000000;i++)
            {
            	al.add(i*i);          	
            }

            long s=sc.nextLong();
            HashSet<Long> aa=new HashSet<>();
            for(long i=1;i*i<=s;i++)
            {
            	if(s%i==0)
            	{
            		aa.add(i);
            		aa.add(s/i);
            	}
            }

            int l=aa.size();
            Collections.sort(aa);
            int ans=0;
            int index=lower(al,0,al.size()-1,Collections.max(set));
                  for(int j=0;j<set.size();j++)
                  {
                  for(int i=0;i<index;i++)
                   {
                       if(set.get(j)%al.get(i)==0)
                       {
                        set.remove(set.get(j));
                         j--;
                        break;
                       }
                        if(set.get(j)<al.get(i))
                        break;         
                  }
                  }
System.out.print(set.size());
}
public static int lower(ArrayList<Integer> list,int start,int end,int key)
    {
        int ans1=-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid==0)
            {
            if(key>list.get(mid) && list.get(mid+1)>key)
            ans1=mid+1;
            }
            else
            {
            if(key>list.get(mid-1) && list.get(mid)>key)
            ans1=mid;
            }
            if(list.get(mid)==key)
            {
                ans=mid;
                end=mid-1;
            }
            else if(list.get(mid)>key)
            {
                end=mid-1;
            }
            else
            {
                 start=mid+1;
            }
        }
        if(ans==0)
        return 0;
        else if(ans==-1 && ans1==-1)
        return -1;
        else if(ans==-1 && ans1!=-1)
        return ans1;
        return ans;
    }

}
