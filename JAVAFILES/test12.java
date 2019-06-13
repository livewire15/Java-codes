import java.util.*;

public class test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
      int adj[][]=new int[V][V];
      	for(int i=0;i<V;i++)
		{
			Arrays.fill(adj[i],0);
		}
      while(E>0)
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        adj[a][b]=1;
        adj[b][a]=1;
        E--;
      }
      int start=sc.nextInt();
      int end=sc.nextInt();
      int visited[]=new int[V];
      Arrays.fill(visited,0);
      System.out.println(dfs(V,adj,start,end,visited));
	}
  
  static boolean dfs(int V,int adj[][],int start,int end,int visited[])
  {
    visited[start]=1;
	if(start==end)
		return true;
		
    for(int i=0;i<V;i++)
    {
      if(i==start)
        continue;
      if(adj[start][i]==1 && visited[i]==0)
      {	
        dfs(V,adj,i,end,visited);
      }
    }
      return false;
  }
  
}