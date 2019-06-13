import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int m=sc.nextInt();
    	int arr[][]=new int[n][m];
    	for(int i=0;i<n;i++)
    	{
            for(int j=0;j<m;j++)
            {
    		  arr[i][j]=sc.nextInt();
            }
    	}
        int visited[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(visited[i],0);
        }
        int ptr[]={1};
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1 && visited[i][j]==0)
                {
                    visited[i][j]=1;
                    count++;
                    dfs(arr,visited,i,j,ptr,n,m);
                    if(ptr[0]>max)
                    {
                        max=ptr[0];
                    }
                    ptr[0]=1;
                }
            }
        }
        System.out.println(count+" "+max);
}
}

static void dfs(int arr[][],int visited[][],int i,int j,int ptr[],int n,int m)
{
    if(i-1>=0 && j-1>=0)
    {
        if(arr[i-1][j-1]==1 && visited[i-1][j-1]==0)
        {
            visited[i-1][j-1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i-1,j-1,ptr,n,m);
        }       
    }
    if(i-1>=0)
    {
        if(arr[i-1][j]==1 && visited[i-1][j]==0)
        {
            visited[i-1][j]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i-1,j,ptr,n,m);
        }
    }
    if(i-1>=0 && j+1<m)
    {
        if(arr[i-1][j+1]==1 && visited[i-1][j+1]==0)
        {
            visited[i-1][j+1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i-1,j+1,ptr,n,m);
        }
    }
    if(j-1>=0)
    {
        if(arr[i][j-1]==1 && visited[i][j-1]==0)
        {
            visited[i][j-1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i,j-1,ptr,n,m);
        }
    }
    if(j+1<m)
    {
        if(arr[i][j+1]==1 && visited[i][j+1]==0)
        {
            visited[i][j+1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i,j+1,ptr,n,m);
        }
    }
    if(i+1<n && j-1>=0)
    {
        if(arr[i+1][j-1]==1 && visited[i+1][j-1]==0)
        {
            visited[i+1][j-1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i+1,j-1,ptr,n,m);
        }
    }
    if(i+1<n)
    {
        if(arr[i+1][j]==1 && visited[i+1][j]==0)
        {
            visited[i+1][j]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i+1,j,ptr,n,m);
        }
    }
    if(i+1<n && j+1<m)
    {
        if(arr[i+1][j+1]==1 && visited[i+1][j+1]==0)
        {
            visited[i+1][j+1]=1;
            ptr[0]=ptr[0]+1;
            dfs(arr,visited,i+1,j+1,ptr,n,m);
        }
    }
}

}