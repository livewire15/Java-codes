import java.util.*;

class Node
{
	int src; 
	int dest;
	int wt;
	Node(int src,int dest,int wt)
	{
		this.src=src;
		this.dest=dest;
		this.wt=wt;
	}
}//used a Node class for adding all the edges in the priority queue.

class subset
{
	int dest,wt;
	subset(int dest,int wt)
	{
		this.dest=dest;
		this.wt=wt;
	}
}//used a subset class for adding nodes in adjacency list.

public class kruskal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		LinkedList<subset> adj[]=new LinkedList[v+1];
		for(int i=0;i<=v;i++)
		{
			adj[i]=new LinkedList<subset>();
		}

		int parent[]=new int[v+1];
		int size[]=new int[v+1];
		for(int i=0;i<=v;i++)
		{
			parent[i]=i;
			size[i]=1;
		}
		PriorityQueue<Node> pq=new PriorityQueue<Node>(new MyComparator());
		for(int i=0;i<e;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int wt=sc.nextInt();
			pq.add(new Node(a,b,wt));// Adding at 0th index gives complexity O(1) coz it does need to traverse the whole as compared to
			 // when the index is not given which gives O(n) complexity.
		}

		int sum=0;
		while(!pq.isEmpty())
		{
			Node tmp=pq.poll();
			int u1=tmp.src;
			int v1=tmp.dest;
			int w1=tmp.wt;
			//System.out.println("Node "+u1+"-"+v1+" = "+w1);
			//System.out.println("p1 "+findParent(u1,parent));
			//System.out.println("p2 "+findParent(v1,parent));
			int u1_parent=findParent(u1,parent);
			int v1_parent=findParent(v1,parent);
			if(u1_parent!=v1_parent) //Here, if parent is not same means they are not forming cycle and can be connected.
			{
				sum=sum+w1;
				adj[u1].add(0,new subset(v1,w1));
				if(size[u1_parent]<size[v1_parent])
				{
					parent[u1]=parent[v1];
					size[v1_parent]+=size[u1_parent];
				}
				else
				{
					parent[v1]=parent[u1];
					size[u1_parent]+=size[v1_parent];
				}
			}
		}
		System.out.println(sum);
		/*for(int i=0;i<=v;i++)
		{
			Iterator<subset> itr=adj[i].listIterator();
			while(itr.hasNext())
			{
				subset tmp=itr.next();
				System.out.println(i+"-"+tmp.dest+"-->"+tmp.wt);

			}
		}*/
	}

	public static int findParent(int v,int parent[])
	{
		while(parent[v]!=v)
		{
			parent[v]=parent[parent[v]];
			v=parent[v];
		}
		return v;
	}
}

class MyComparator implements Comparator<Node>
{
	public int compare(Node x,Node y)
	{
		return x.wt-y.wt;
	}//for ascending.
}

