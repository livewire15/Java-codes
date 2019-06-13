import java.util.*;
class test13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int adj[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			Arrays.fill(adj[i],0);
		}
		for(int i=1;i<n;i++)
		{
			int e1=sc.nextInt();
			adj[i][i+e1]=1;
		}
		int visited[]=new int[n+1];
		Arrays.fill(visited,0);
		if(print(adj,n,1,t,visited))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	static boolean print(int adj[][],int n,int sv,int t,int visited[])
	{
		//System.out.println(sv+" ");
		if(sv==t)
			return true;
		visited[sv]=1;
		for(int i=1;i<=n;i++)
		{
		if(sv==i)
			continue;
		if(adj[sv][i]==1)
		{
			if(visited[i]==1)
				continue;
			return print(adj,n,i,t,visited);
		}
	}
	return false;
}
}