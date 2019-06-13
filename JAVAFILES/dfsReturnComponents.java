import java.util.*;
class dfsReturnComponents
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int adj[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			Arrays.fill(adj[i],0);
		}
		while(e>0)
		{
			int e1=sc.nextInt();
			int e2=sc.nextInt();
			adj[e1][e2]=1;
			adj[e2][e1]=1;
			e--;
		}
		int visited[]=new int[n];
		Arrays.fill(visited,0);
		for(int i=0;i<n;i++)
		{
			if(visited[i]==0)
            {
              ArrayList<Integer> al=new ArrayList<>();
           	  print(adj,n,i,visited,al);
              Collections.sort(al);
              for(int j:al)
              {
                System.out.print(j+" ");
              }
              System.out.println();
			}
		}
    }
	
	static void print(int adj[][],int n,int sv,int visited[],ArrayList<Integer> al)
	{
		visited[sv]=1;
      	al.add(sv);
		for(int i=0;i<n;i++)
		{
		if(sv==i)
			continue;
		if(adj[sv][i]==1)
		{
			if(visited[i]==1)
				continue;
			print(adj,n,i,visited,al);
		}
		}
	}
}