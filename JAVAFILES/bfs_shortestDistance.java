import java.util.*;

public class bfs_shortestDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
		int V = sc.nextInt();
		int E = sc.nextInt();
		int E1=E;
		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
      int adj[][]=new int[V+1][V+1];
      for(int i=0;i<=V;i++)
        Arrays.fill(adj[i],0);
      while(E1>0)
      {
        int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.println("a="+a+" "+"b="+b)
        adj[a][b]=1;
        adj[b][a]=1;
		E1--;
      }
	  int sv=sc.nextInt();
      ArrayList<Integer> al=new ArrayList<>(V+1);//this is a Queue
      al.add(sv);
	   
      int visited[]=new int[V+1];//Visited array
      Arrays.fill(visited,0);
      visited[sv]=1;
      int i=0;
     int dist[]=new int[V+1];
     int idx[]=new int[V+1];
     Arrays.fill(dist,-1);
     Arrays.fill(idx,0);
	 
     while(i<al.size())//till all edges are covered in the graph
     {
        for(int j=1;j<=V;j++)
        {
          if(al.get(i)==j)
            continue;
          else
          {
           if(adj[al.get(i)][j]==1)
           {
             if(visited[j]==0)
             {
               al.add(j);
               visited[j]=1;
               idx[j]=idx[al.get(i)]+1; 
               dist[j]=6*(idx[j]);
			   //System.out.print("a"+dist[j]+" ");
             }
           }
          }
        }
       i++;
      }
	  
        for(int j=1;j<dist.length;j++)
        {
            if(j==sv)
                continue;
            else
                System.out.print(dist[j]+" ");
        }
            System.out.println();
    t--;
        }
	}
}