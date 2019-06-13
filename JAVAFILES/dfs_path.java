import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dfs_path {

		public static LinkedList<Integer> adj[];
		public static boolean visited[];
		static String output=" ";
		int vertices;
		
		dfs_path(int v)
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
			adj[e2].add(e1);
		}
		
		public void traverse(int start,int dest)
		{
			if(start==dest)
				System.out.println("Output:"+start);
			else
			{
			output+=" "+Integer.toString(start);
			//System.out.println("Output:"+output);
			visited[start]=true;
			Iterator<Integer> i=adj[start].listIterator();
			while(i.hasNext())
			{ 
			int n=i.next();		
			if(!visited[n])
			{
				if(n==dest)
			{ 
				output+=" "+Integer.toString(n);
				System.out.println("Output:"+output);
				break;
			}
			traverse(n,dest);
			}
			}
		}
		}
		
		public static void main(String args[])
		{
			String result="";
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int e=sc.nextInt();
			dfs_path obj=new dfs_path(n);
			for(int i=0;i<e;i++)
		{
		int e1=sc.nextInt();
		int e2=sc.nextInt();
		obj.addedge(e1,e2);
		}
		int start=sc.nextInt();
		int end=sc.nextInt();
			obj.traverse(start,end);
			//System.out.println(output);
		}
}
			