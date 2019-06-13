import java.util.*;
class dfsConnected
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
		print(adj,n,0,visited);
		int flag=0;
		for(int i:visited)
		{
		if(i==0)
		{
		  flag=-1;
		  break;
		}
		}
		if(flag==-1)
			System.out.println("false");
		else
			System.out.println("true");
	}
	
	static void print(int adj[][],int n,int sv,int visited[])
	{
		visited[sv]=1;
		for(int i=0;i<n;i++)
		{
		if(sv==i)
			continue;
		if(adj[sv][i]==1)
		{
			if(visited[i]==1)
				continue;
			print(adj,n,i,visited);
		}
	}
}
}