import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class roadsLibraries {

    // Complete the roadsAndLibraries function below.
    static void roadsAndLibraries(int number, int c_lib, int c_road,LinkedList<Integer> adj[],int source,int visited[],long sum[])
	{   	
        visited[source]=1;
        Iterator<Integer> itr=adj[source].listIterator();
        while(itr.hasNext())
        {
            int n=itr.next();
            if(visited[n]==0)
            {    
				sum[0]+=c_road;
                roadsAndLibraries(number,c_lib,c_road,adj,n,visited,sum);
            }
        }
        }

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);

        int q = sc.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c_lib=sc.nextInt();
            int c_road=sc.nextInt();
            int[][] cities = new int[m][2];
            
            for (int i = 0; i < m; i++) {
                cities[i][0]=sc.nextInt();
                cities[i][1]=sc.nextInt();
                }
        
        LinkedList<Integer> adj[]=new LinkedList[n+1];
        for(int i=0;i<=n;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<cities.length;i++)
        {
            adj[cities[i][0]].add(cities[i][1]);
            adj[cities[i][1]].add(cities[i][0]);
        }
            int visited[]=new int[n+1];
            Arrays.fill(visited,0);
            long sum[]={0};           
			 if(c_road>=c_lib)
				System.out.println((long)((long)n*(long)c_lib));
			else
			{
				for(int i=1;i<=n;i++)
				{				
					if(visited[i]==0)
						{	
							 sum[0]+=c_lib;					
							 roadsAndLibraries(n, c_lib, c_road, adj,i,visited,sum);					
						}
				}
				System.out.println(sum[0]);
			}
        }
    }
}
