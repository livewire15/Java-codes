import java.util.*;
/*import javafx.util.Pair;*/
import java.util.HashMap;

class Mycomparator implements Comparator<Pair<Integer,Integer>>
{
	@Override
	public int compare(Pair<Integer,Integer> x,Pair<Integer,Integer> y)
    {
        return x.getValue()-y.getValue();
    }

} 

class Pair<T,U>
{
	T start;
	U cost;
	public T getKey()
	{
		return start;
	}
	public U getValue()
	{
		return cost;
	}

	Pair(T start,U cost)
	{
		this.start=start;
		this.cost=cost;
	}
}

 public class djikstra_new  
{	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int e = sc.nextInt();
            HashMap<Integer,ArrayList<Pair<Integer,Integer>>> adj=new HashMap<Integer,ArrayList<Pair<Integer,Integer>>>(n+1);
            for(int i=0;i<=n;i++)
            	adj.put(i,new ArrayList<Pair<Integer,Integer>>(n+1));

            while(e-- >0)
            {
            	int a=sc.nextInt();
            	int b=sc.nextInt();
            	int cost=sc.nextInt();
            	adj.get(a).add(new Pair<Integer,Integer>(b,cost));
            	adj.get(b).add(new Pair<Integer,Integer>(a,cost));
            }
            int start = sc.nextInt();
            int dist[] = new int[n+1];
            int visited[]=new int[n+1];
            Arrays.fill(visited,0);
		    Arrays.fill(dist, Integer.MAX_VALUE);
            call_djikstra(n,adj,start,dist,visited);
            for(int i=1; i<dist.length; i++)
        	{
	            if(i!=start)
	            {
	                System.out.print(((dist[i] == Integer.MAX_VALUE)?-1:dist[i]) + " ");
	            }
        	}
        	System.out.println();
        }
    }

            static void call_djikstra(int n,HashMap<Integer,ArrayList<Pair<Integer,Integer>>> adj,int start,int dist[],int visited[])
            {
		        dist[start] = 0;
		        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<Pair<Integer,Integer>>(new Mycomparator());
		        pq.add(new Pair<Integer,Integer>(start,0));
		        while(pq.size()!=0)
		        {
		        	Pair<Integer,Integer> pair=pq.poll();
		        	int vertex=pair.getKey();
		        	if(visited[vertex]==1)
		        		continue;
		        	visited[vertex]=1;
		        	Iterator<Pair<Integer,Integer>> itr=adj.get(vertex).listIterator();
		        	while(itr.hasNext())
		        	{
		        		Pair<Integer,Integer> temp=itr.next();
		        		if(dist[temp.getKey()] > dist[vertex] + temp.getValue())
		        		{
		        			pq.add(new Pair<Integer,Integer>(temp.getKey(), dist[vertex] + temp.getValue()));
		        			dist[temp.getKey()]=dist[vertex] + temp.getValue();
		        		}
		        	}
		        }
            }
        }
