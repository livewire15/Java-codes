import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    LinkedList<Integer> adj[]=new LinkedList[n+1];
    for(int i=0;i<=n;i++)
        adj[i]=new LinkedList();
    while(m-->0)
    {
    	int a=sc.nextInt();
        int b=sc.nextInt();
        adj[a].add(b);
        adj[b].add(a);
    }
    int visited[]=new int[n+1];
    Arrays.fill(visited,0);
    int ptr[]={1};
    HashSet<Integer> set=new HashSet<>();
    for(int i=1;i<=n;i++)
    {
        if(visited[i]==0)  
        {
            dfs(n,visited,adj,i,ptr);
            set.add(ptr[0]);
            ptr[0]=1;
        }
    }
    int l=set.size();
    int set1[]=new int[l];
    int k=0;
    Iterator<Integer> itr=set.iterator();
    while(itr.hasNext())
    {
        set1[k++]=itr.next();
    }
    System.out.println(maxSubarrayXOR(set1,l));
    //System.out.println(set);
}
 
static final int INT_BITS = 32; 

static int maxSubarrayXOR(int set[], int n) 
{  
    int index = 0;  
    for (int i = INT_BITS - 1; i >= 0; i--)  
    { 
    int maxInd = index; 
    int maxEle = Integer.MIN_VALUE; 
    for (int j = index; j < n; j++) {  
        if ((set[j] & (1 << i)) != 0 && set[j] > maxEle) 
        { 
        maxEle = set[j]; 
        maxInd = j; 
        } 
    } 

    if (maxEle == -2147483648) 
        continue; 
 
    int temp = set[index]; 
    set[index] = set[maxInd]; 
    set[maxInd] = temp; 
    maxInd = index; 
   
    for (int j = 0; j < n; j++) { 
           
        if (j != maxInd && (set[j] & (1 << i)) != 0) 
        set[j] = set[j] ^ set[maxInd]; 
    } 
 
    index++; 
    } 
  
    int res = 0; 
    for (int i = 0; i < n; i++) 
    res ^= set[i]; 
    return res; 
} 
 
static void dfs(int n,int visited[],LinkedList<Integer> adj[],int start,int ptr[])
    {
        visited[start]=1;
        Iterator<Integer> itr=adj[start].listIterator();
        while(itr.hasNext())
        {
            int val=itr.next();
            if(visited[val]==0)
            {
                ptr[0]=ptr[0]+1;
                dfs(n,visited,adj,val,ptr);
            }
        }
    }
}