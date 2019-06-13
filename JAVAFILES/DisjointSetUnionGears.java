import java.util.*;
import java.math.*;
import java.util.HashMap;

class DisjointSetUnionGears
{
static HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int teeth[]=new int[n+1];
int cycle[]=new int[n+1];
Arrays.fill(cycle,0);
for(int i=1;i<=n;i++)
{
	map.put(i,new HashSet<Integer>());
	map.get(i).add(i);
}
for(int i=1;i<=n;i++)
{
teeth[i]=sc.nextInt();
}
int parent[]=new int[n+1];
int size[]=new int[n+1];
int sign[]=new int[n+1];
initialize(parent,n,size);
while(m>0)
{
	int m1=sc.nextInt();
	if(m1==1)
	{
		int x=sc.nextInt();
		int c=sc.nextInt();
		teeth[x]=c;
	}
	else if(m1==2)
	{
	int x=sc.nextInt();
	int y=sc.nextInt();
	weighted_union(parent,size,x,y,cycle,sign);
	}
	else
	{
	int x=sc.nextInt();
	int y=sc.nextInt();
	int v=sc.nextInt();
		if(cycle[root(parent,x)]==1 || cycle[root(parent,y)]==1)
		{
			System.out.println(0);
		}
		else
		{
			if(find(parent,x,y))
			{
				if(sign[x]==sign[y])
				{
					long num=v*teeth[x];
					long deno=teeth[y];
					long gcd=gcd(num,deno);
					System.out.println(num/gcd+"/"+deno/gcd);
				}
				else
				{
					long num=v*teeth[x];
					long deno=teeth[y];
					long gcd=gcd(num,deno);
					System.out.println(-num/gcd+"/"+deno/gcd);
				}
			}
			else
			{
				System.out.println(0);
			}
		}
	}
	m--;
}
}
				
//modified initialize function:
static void initialize( int Arr[ ], int N,int size[])
{
    for(int i = 1;i<=N;i++)
	{
	Arr[ i ] = i ;
	size[ i ] = 1;
	}
}

// modified root function.
static int root (int Arr[ ] ,int i)
{
    while(Arr[ i ] != i)
    {
        Arr[ i ] = Arr[ Arr[ i ] ] ; 
		i = Arr[ i ]; 
    }
	return i;
}

static boolean find(int arr[],int A,int B)
{
    if( root(arr,A)==root(arr,B) )       //if A and B have same root,means they are connected.
    return true;
    else
    return false;
}

static long gcd(long a,long b)
{
	if(a==0)
		return b;
	return gcd(b%a,a);
}

static void weighted_union(int Arr[ ],int size[ ],int A,int B,int cycle[],int sign[])
{
    int root_A = root(Arr,A);
    int root_B = root(Arr,B);
	if(root_A==root_B)
	{
		if(sign[A]==sign[B])
		{
			cycle[root_A]=1;
		}
	}
	else
	{		
    if(size[root_A] < size[root_B ])
    {
	Arr[ root_A ] = Arr[root_B];
	if(size[root_A]>1 && size[root_B]>1)
	{
		if(sign[A]==sign[B])
		{
			Iterator<Integer> itr=map.get(root_A).iterator();
			while(itr.hasNext())
			{
				int val=itr.next();
				sign[val]=-sign[val];
			}
		}
	}
	else
	{
	if(size[root_A]==1 && size[root_B]==1)
		sign[root_B]=1;
	sign[A]=-sign[B];
	}
	cycle[root_A]=Math.max(cycle[root_A],cycle[root_B]);
	cycle[root_B]=Math.max(cycle[root_A],cycle[root_B]);
	size[root_B] += size[root_A];
	HashSet<Integer> set=map.get(root_B);
	set.addAll(map.get(root_A));
	map.put(root_B,set);
	}
else
    {
	Arr[ root_B ] = Arr[root_A];
	if(size[root_A]>1 && size[root_B]>1)
	{
		if(sign[A]==sign[B])
		{
			Iterator<Integer> itr=map.get(root_B).iterator();
			while(itr.hasNext())
			{
				int val=itr.next();
				sign[val]=-sign[val];
			}
		}
	}
	else
	{
	if(size[root_A]==1 && size[root_B]==1)
		sign[root_A]=1;
	sign[B]=-sign[A];
	}
	cycle[root_A]=Math.max(cycle[root_A],cycle[root_B]);
	cycle[root_B]=Math.max(cycle[root_A],cycle[root_B]);
	size[root_A] += size[root_B];
	HashSet<Integer> set=map.get(root_A);
	set.addAll(map.get(root_B));
	map.put(root_A,set);
	}
}
}
}