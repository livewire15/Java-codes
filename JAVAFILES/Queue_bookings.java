import java.util.*;
public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());
        int l=arrive.size();
        ArrayList<Help> al=new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            Help as=new Help();
            as.a=arrive.get(i);
            as.b=depart.get(i);
            al.add(as);
        }
        Collections.sort(al, new A());
        for(int i=0;i<l;i++)
        {
            int value=al.get(i).a;
            int value2=al.get(i).b;
            arrive.set(i,value);
            depart.set(i,value2);
        }

        queue.add(depart.get(0));
        int c=1;
        int flag=0;
        for(int i=1;i<l;i++)
        {
            int val=queue.peek();
            if(val<=arrive.get(i) && arrive.get(i)!=depart.get(i))
            {
                queue.poll();
                queue.add(depart.get(i));
            }
            else
            {
                if(c+1<=K)
                {
                    queue.add(depart.get(i));
                    c=c+1;
                }
                else
                    {
                        if(arrive.get(i)!=depart.get(i))
                        {
                        flag=1;
                        break;
                        }
                    }
            }
        }

        if(flag==1)
            return false;
        return true;
        
    }
}

class Help  
{
        int a;
        int b;
}
class A implements Comparator<Help>
{
    public int compare(Help A,Help B)
    {
        if(A.a==B.a)
        {
            return A.b-B.b;
        }
        return A.a-B.a;
    }
}
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        if(a<b)
        return -1;
        return 1;
    }
}