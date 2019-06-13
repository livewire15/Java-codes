import java.util.*;
class earth 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=sc.next();
        String b=sc.next();
        int l=s.length();
        int l1=a.length();
        int l2=b.length();
        int idx1=0,idx2=0;
    	for(int i=0;i<l-l1;i++)
    	{
            String temp=s.substring(i,i+l1);
            if(temp.equals(a))
            {
                idx1=i;
                break;
            }
    	}
        for(int i=0;i<l-l2;i++)
        {
            String temp=s.substring(i,i+l2);
            if(temp.equals(b))
            {
                idx2=i;
                break;
            }
        }

        if(idx1<idx2)
        {
            for(int i=idx1+1;i<idx2;i++)
            {
                String temp=s.substring(i,i+l1);
                if(temp.equals(a))
                {
                    idx1=i;
                }            
            }
        }
        else
        {
         for(int i=idx2+1;i<idx1;i++)
            {
                String temp=s.substring(i,i+l2);
                if(temp.equals(b))
                {
                    idx2=i;
                }            
            }   
        }
        //idx1 and idx2 updated..both are the closest.
        long total=Math.min(idx1,idx2)+1;
        for(int i=Math.max(idx1,idx2)+1;i<=l-(Math.min(l1,l2));i++)
        {
            String a1="",a2="";
            if((i+l1)<=l)
                 a1=s.substring(i,i+l1);
            if((i+l2)<=l)
                 a2=s.substring(i,i+l2);
            if(a1.equals(a) && a2.equals(b))
            {
                idx1=i;
                idx2=i;
                total+=Math.max(idx1,idx2)+1;
            }
            else if(a1.equals(a))
            {
                idx1=i;
                total+=idx2+1;
            }
            else if(a2.equals(b))
            {
                idx2=i;
                total+=idx1+1;
            }
        }
        //System.out.println("idx1 "+idx1+" idx2 "+idx2);
        total+=(Math.min(idx1,idx2)+1)*(l-Math.max(idx1,idx2)-1);
        System.out.println(total);
    }
}