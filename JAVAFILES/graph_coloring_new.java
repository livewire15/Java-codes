import java.util.*;
class graph_coloring_new
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
 while(t>0)
        {
		int V = sc.nextInt();
		int E = sc.nextInt();
		int E1=E;
		int adj[][]=new int[V+1][V+1];
		for(int i=0;i<=V;i++)
        Arrays.fill(adj[i],0);
		while(E1>0)
		{
        int a=sc.nextInt();
		int b=sc.nextInt();
        adj[a][b]=1;
        adj[b][a]=1;
		E1--;
		}
		int x[]=new int[V+1];
		Arrays.fill(x,0);
		gcolor(1,V,4,x,adj);
		t--;
	}
}

static void gcolor(int k,int n,int m,int x[],int g[][])
{
if(k<=n)
{
for(int c=1;c<=m;c++)
{
if(isSafe(k,c,n,x,g))
{
x[k]=c;
gcolor(k+1,n,m,x,g);
return;
//x[k]=0;//backtrack..used when finding all possible solutions
}
}
}
else
{
System.out.println(1);
for(int i=1;i<=n;i++)
{
System.out.print(x[i]+" ");
}
//System.out.println();
return;
}
}

static boolean isSafe(int k,int c,int n,int x[],int g[][])
{
for(int j=1;j<=n;j++)
{
if(g[k][j]==1 && x[j]==c)
return false;
}
return true;
}

}
