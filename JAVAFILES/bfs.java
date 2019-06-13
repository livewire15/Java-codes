import java.io.*;
import java.util.*;

class bfs
{
public int vertices;
//@SuppressWarnings("unchecked")
public static LinkedList<Integer> adj[];

bfs(int v)
{
vertices=v;
//@SuppressWarnings("unchecked")
adj=new LinkedList[v+1];
for(int i=1;i<=v;i++)
{
adj[i]=new LinkedList<Integer>();
}
}

public void addEdge(int v,int w)
{
adj[v].add(w);
}

public void graph(int s,int n1)
{
	int start=s;
boolean visited[]=new boolean[n1+1];
LinkedList<Integer> queue=new LinkedList<Integer>();
int arr[]=new int[n1+1];
Arrays.fill(arr,-1);
int k=0;
visited[s]=true;
queue.add(s);
while(queue.size()!=0)
{
s=queue.poll();
Iterator<Integer> i=adj[s].listIterator();
if(i!=null)
{
	k++;
}
while(i.hasNext())
{
int n=i.next();
if(!visited[n])
{
visited[n]=true;
queue.add(n);
arr[n]=6*k;
}
}
}

for(int i=1;i<=n1;i++)
{
if(i!=(start))
	System.out.print(arr[i]+" ");
}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	for(int i=0;i<q;i++)
	{
		int n=sc.nextInt();
		bfs obj=new bfs(n);
		int e=sc.nextInt();
		for(int j=0;j<e;j++)
		{
			int e1=sc.nextInt();
			int e2=sc.nextInt();
			obj.addEdge(e1,e2);
		}
		int s=sc.nextInt();
		obj.graph(s,n);
			for(int j1=1;j1<=n;j1++)
		{
			System.out.println("adj="+adj[j1].size());
		}
	}
}
}