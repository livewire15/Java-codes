import java.util.*;
import java.util.HashMap;
class cc3 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {   
        int val=5;
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        ArrayList<Integer> key=new ArrayList<>();
        while(val-->0)
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        key.add(a);
        if(hm.containsKey(a))
        {
            ArrayList<Integer> al=hm.get(a);
            al.add(b);
            hm.put(a,al);
        }
            else
            {
                ArrayList<Integer> al=new ArrayList<Integer>();
                al.add(b);
                hm.put(a,al);
            }
        }
        System.out.println(hm);
        int flag=0,flag1=0,count=0;
        ArrayList<Integer> b1=new ArrayList<>();
        int a=0;
        for(int i=0;i<key.size();i++)
        {
            ArrayList<Integer> al=hm.get(key.get(i));
            if(al.size()==1)
            {
                if(count==0)
                {
                     a=key.get(i);
                     b1=hm.get(a);
                    count++;
                }
                else if(count==1)
                {
                   ArrayList<Integer> all=hm.get(key.get(i));
                   System.out.println("h "+all.get(0));
                   int v1=Math.abs(key.get(i)-a);
                   int v2=Math.abs(all.get(0)-b1.get(0));
                   if(v1==2 && v2==0)
                   {
                       flag=1;
                   } 
                }
                else
                {
                    flag=0;
                }
            }
            else if(al.size()==3)
            {
                Collections.sort(al);
               if((Math.abs(al.get(0)-al.get(1))+Math.abs(al.get(1)-al.get(2)))==2)
               {
                   flag1=1;
               }
            }
            else
            {
                flag=0;
                flag1=0;
                break;
            }
        }
        if(flag==1 && flag1==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }      
}
}