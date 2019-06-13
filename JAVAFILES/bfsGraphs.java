import java.util.*;
 class bfsGraphs
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
 	bfs(n,adj,visited,2);
 }

 static void bfs(int n,LinkedList<Integer> adj[],int visited[],int start)
 {
 	LinkedList<Integer> queue=new LinkedList<Integer>();
 	queue.add(start);
 	visited[start]=1;
 	while(queue.size()!=0)
 	{
 		int val=queue.poll();
 		System.out.print(val+" ");
 		Iterator<Integer> itr=adj[val].listIterator();
 		while(itr.hasNext())
 		{
 			int num=itr.next();
 			if(visited[num]==0)
 			{
 			queue.add(num);
 			visited[num]=1;
 			}
 		}
 	}
 }
}