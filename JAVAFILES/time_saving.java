import java.util.*;
 class time_saving 
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int k=sc.nextInt();
 int m=sc.nextInt();
 int adj[][]=new int[n+1][n+1];
 for(int i=0;i<=n;i++)
 {
 Arrays.fill(adj[i],0);
 }
 while(m>0)
 {
 int a=sc.nextInt();
 int b=sc.nextInt();
 int t=sc.nextInt();
 adj[a][b]=t;
 adj[b][a]=t;
 m--;
 }
 int visited[]=new int[n+1];
 Arrays.fill(visited,0);
 int min[]={Integer.MAX_VALUE};
 path(n,k,m,adj,1,n,0,visited,min);
 System.out.println(min[0]);
 }
 
 static void path(int n,int k,int m,int adj[][],int sv,int end,int time,int visited[],int min[])
 {
 //visited[sv]=1;
 if(sv==end)
 {
 //System.out.println(time);
 if(time<min[0])
	min[0]=time;
	//return;
 }
 
 for(int i=sv;i<=n;i++)
 {
 if(adj[sv][i]!=0 && visited[i]==0)
 {
	 //System.out.print(sv+" ("+time+")");
	time+=adj[sv][i];
	if((time/k)%2!=0)
	{
		time+=k;
	}
	path(n,k,m,adj,i,end,time,visited,min);
	time=time-adj[sv][i];
	//System.out.println(time+" time");
	//time=0;
	//visited[sv]=0;
 }
 }
 }
 }