import java.util.*;

class Node
{
int dest;
int wt;
Node(int dest,int wt)
{
this.dest=dest;
this.wt=wt;
}
}

public class prims
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
int e=sc.nextInt();
LinkedList<Node> adj[]=new LinkedList[v];// Array of linked lists.
for(int i=0;i<v;i++)
{
adj[i]=new LinkedList<Node>();
}

for(int i=0;i<e;i++)
{
int a=sc.nextInt();
int b=sc.nextInt();
int wt=sc.nextInt();
adj[a].add(0,new Node(b,wt)); // Adding at 0th index gives complexity O(1) coz it does need to traverse the whole as compared to
adj[b].add(0,new Node(a,wt)); // when the index is not given which gives O(n) complexity.
}											

int visited[]=new int[v];
Arrays.fill(visited,0);
int parent[]=new int[v];
int key[]=new int[v];
Arrays.fill(key,Integer.MAX_VALUE);
PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new MyComparator());
pq.add(0);//adding the source vertex
while(!pq.isEmpty())
	mst(v,e,adj,visited,parent,pq,key);
for(int i=1;i<v;i++)
{
	System.out.println(parent[i]+" ==> "+i+" = "+key[i]);
}		 
}

static void mst(int v,int e,LinkedList<Node> adj[],int visited[],int parent[],PriorityQueue<Integer> pq,int key[])
{
	int source=pq.poll();
	visited[source]=1;
	Iterator<Node> itr=adj[source].listIterator();
	while(itr.hasNext())
	{
		Node val=itr.next();
		if(visited[val.dest]==0)
		{
			pq.add(val.dest);
			if(val.wt<key[val.dest])
			{
				parent[val.dest]=source;
				key[val.dest]=val.wt;
			}
		}
	}
}
}

 class MyComparator implements Comparator<Integer> {
	public int compare(Integer x,Integer y)
    {
       return x-y;//for ascending
    }
}
