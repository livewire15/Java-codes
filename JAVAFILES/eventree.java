import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class eventree {

public static int count=1;
		public static LinkedList<Integer> adj[];
		public static boolean visited[];
		int vertices,max=0;
		int k=0;
		
		eventree(int v)
		{
		vertices=v;
		arr=new int[vertices];
		adj=new LinkedList[vertices+1];
		visited=new boolean[vertices+1];
		for(int i=1;i<=vertices;i++)
		adj[i]=new LinkedList<Integer>();
		}
		
		public void addedge(int e1,int e2)
		{
			adj[e1].add(e2);
			adj[e2].add(e1);
		}
		
		public int traverse(int j,int count,int max)
		{
			visited[j]=true;
			int arr[]=new int[vertices];
			Arrays.fill(arr,0);
			int k=0;
			Iterator<Integer> i=adj[j].listIterator();
			while(i.hasNext())
			{ 
			int n=i.next();
			if(n!=1)
			{
			if(!visited[n])
			{
			//System.out.println("value of n="+n+"\tcount="+count);
				count++;
			traverse(n,count,max);
			}
			}
			}
			return count;
		}
		
    public static void main(String[] args)
	{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int arr[]=new int[n];
		int remove=0,k=0,max=0;
		eventree obj=new eventree(n);
		for(int i=0;i<e;i++)
		{
		int e1=sc.nextInt();
		int e2=sc.nextInt();
		obj.addedge(e1,e2);
		}
		for(int j=1;j<=n;j++)
		{
		if(adj[j].size()==1 && visited[j]==false)
		{
			count=obj.traverse(j,count,max);
			//System.out.println("count="+count+"\tj="+j);	
			System.out.println();
			if(count%2==0)
			{
				remove++;
			}
			count=1;
			max=0;
			k=0;
		}
    }
	System.out.println(remove);
}
}