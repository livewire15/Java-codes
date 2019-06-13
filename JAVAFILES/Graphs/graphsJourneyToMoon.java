import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the journeyToMoon function below.
    static void journeyToMoon(int n, LinkedList<Integer> adj[],int visited[],int source,int count[]) 
    {
    visited[source]=1;
    count[0]+=1;
    Iterator<Integer> itr=adj[source].listIterator();
        while(itr.hasNext())
        {
            int val=itr.next();
            if(visited[val]==0)
            {
                journeyToMoon(n,adj,visited,val,count);
            }
        }       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }
        LinkedList<Integer> adj[]=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<p;i++)
        {
            adj[astronaut[i][0]].add(astronaut[i][1]);
            adj[astronaut[i][1]].add(astronaut[i][0]);
        }
        int visited[]=new int[n];
        Arrays.fill(visited,0);
        int connectedComp=0;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                int count[]={0};
                connectedComp++;
                journeyToMoon(n, adj,visited,i,count);
                arr[connectedComp]=count[0];
            }
        }
        if(connectedComp==1)
        {
            System.out.println(0);
        }
        else
        {
            long sum=arr[1];
            long val=0;
            for(int i=2;i<=connectedComp;i++)
            {
                    val=val+(long)arr[i]*(long)sum;
                sum+=arr[i];
            }
            System.out.println(val);
        }

        bufferedWriter.close();

        scanner.close();
    }
}
