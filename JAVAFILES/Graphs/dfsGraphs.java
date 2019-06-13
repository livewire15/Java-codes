import java.util.*;
 class dfsGraphs
 {
 	public static void main(String args[])
 	{
 	Scanner sc=new Scanner(System.in);
 	int n=sc.nextInt();
 	int e=sc.nextInt();
 	LinkedList<Integer> adj[]=new LinkedList[n];
 	for(int i=0;i<n;i++)
 		adj[i]=new LinkedList();
 	
 	while(e>0)
 	{
 	int a=sc.nextInt();
 	int b=sc.nextInt();
 	adj[a].add(b);
 	adj[b].add(a);
 	e--;
 	}
 	int visited[]=new int[n];
 	Arrays.fill(visited,0);
 	dfs(n,visited,adj,0);
 	}

 	static void dfs(int n,int visited[],LinkedList<Integer> adj[],int start)
 	{
 		System.out.print(start+" ");
 		visited[start]=1;
 		Iterator<Integer> itr=adj[start].listIterator();
 		while(itr.hasNext())
 		{
 			int val=itr.next();
 			if(visited[val]==0)
 			{
 				dfs(n,visited,adj,val);
 			}
 		}
 	}
 }