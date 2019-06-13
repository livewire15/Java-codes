import java.util.*;

public class Solution {

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
      int ap[]={0};
      System.out.println(dfs(V,adj,start,end,visited,ap));
	}
  
  static boolean dfs(int V,int adj[][],int start,int end,int visited[],int ap[])
  {
    visited[start]=1;
    for(int i=0;i<V;i++)
    {
      if(i==start)
        continue;
      if(adj[start][i]==1 && visited[i]==0)
      {	
        if(i==end)
        {
      	ap[0]=1;
          break;
        }
        else
        {
        dfs(V,adj,i,end,visited,ap);
        }
      }
    }
    if(ap[0]==1)
      return true;
    else
      return false;
  }
  
}