import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dfs_cycle {

		int flag=0;
		public static LinkedList<Integer> adj[];
		public static boolean visited[];
		static String output=" ";
		int vertices;
		
		dfs_cycle(int v)
		{
		vertices=v;
		adj=new LinkedList[vertices+1];
		visited=new boolean[vertices+1];
		for(int i=1;i<=vertices;i++)
		adj[i]=new LinkedList<Integer>();
		}
		
		public void addedge(int e1,int e2)
		{
			adj[e1].add(e2);
		}
		
		public String traverse(int start)
		{
				visited[start]=true;
				Iterator<Integer> i=adj[start].listIterator();
				
				while(i.hasNext())
				{
						int n=i.next();
						if(visited[n]==true)
						{
						System.out.println("Cycle exists at node"+n);
						flag=1;
						break;
						}
						traverse(n);
				}
				if(flag==1)
					System.exit(0);
				return "\n";
		}
		
		public static void main(String args[])
		{
			String result="";
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int e=sc.nextInt();
			dfs_cycle obj=new dfs_cycle(n);
			for(int i=0;i<e;i++)
			{
			int e1=sc.nextInt();
			int e2=sc.nextInt();
			obj.addedge(e1,e2);
			}
			int start=sc.nextInt();
			String res=obj.traverse(start);
		}
}
			