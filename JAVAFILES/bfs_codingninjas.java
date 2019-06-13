import java.util.*;

public class bfs_codingninjas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
      int adj[][]=new int[V+1][V+1];
      for(int i=0;i<=V;i++)
        Arrays.fill(adj[i],0);
      
      while(E>0)
      {
        int a=sc.nextInt();
		int b=sc.nextInt();
        adj[a][b]=1;
        adj[b][a]=1;
        E--;
      }
      
      ArrayList<Integer> al=new ArrayList<>(V+1);//this is a Queue
	  //Note capacity of arraylist is V+1 but its size 1 as only 1 element is added.
      al.add(0);
      int visited[]=new int[V];//Visited array
      Arrays.fill(visited,0);
      visited[0]=1;
      int i=0;
	  //Note Here always put al.size() only then index will not go out of bound.
     while(i<al.size())//till all verices are covered in the graph
     {
       System.out.print(al.get(i)+" ");
        for(int j=0;j<V;j++)
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
             }
           }
          }
        }
       i++;
      }
	}
}