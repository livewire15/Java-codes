import java.util.*;
 
public class PriorityQueue1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n,new MyComparator());
        for(int i=0;i<n;i++)
        {
            pq.add(sc.nextInt());
        }
        while (!pq.isEmpty()) 
        {
        System.out.println(pq.poll());// extracts the top element and removes it.
        } 
    } 
 }
 class MyComparator implements Comparator<Integer>
{
            public int compare(Integer a, Integer b) 
            {
                return a-b;
            }
}

 