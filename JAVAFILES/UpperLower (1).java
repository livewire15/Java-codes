import java.util.*;
public class UpperLower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        int key=sc.nextInt();
        Binary obj=new Binary(list);
        System.out.println(obj.lower(0,list.size()-1,key));
        System.out.println(obj.upper(0,list.size()-1,key));
    }
}
class Binary
{
    ArrayList<Integer> list;
    Binary(ArrayList<Integer> list)
    {
        this.list=list;
    }
    
    public int lower(int start,int end,int key)
    {
        int ans1=-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid==0)
            {
            if(key>this.list.get(mid) && this.list.get(mid+1)>key)
            ans1=mid+1;
            }
            else
            {
            if(key>this.list.get(mid-1) && this.list.get(mid)>key)
            ans1=mid;
            }
            if(this.list.get(mid)==key)
            {
                ans=mid;
                end=mid-1;
            }
            else if(this.list.get(mid)>key)
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
    public int upper(int start,int end,int key)
    {
          int ans1=-1;
           int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
           if(mid==0)
            {
            if(key>this.list.get(mid) && this.list.get(mid+1)>key)
            ans1=mid+1;
            }
            else
            {
            if(key>this.list.get(mid-1) && this.list.get(mid)>key)
            ans1=mid;
            } 
            if(this.list.get(mid)==key)
            {
                ans=mid;
                start=mid+1;
            }
            else if(this.list.get(mid)>key)
            {
                end=mid-1;
            }
            else
            {
                 start=mid+1;
            }
        }
        if(ans==-1 && ans1!=-2)
        return ans1;
        if(ans==-1 && ans1==-1)
        return -1;
        if(ans==list.size()-1 )
        return list.size()-1;
        return ans+1;
    }
}