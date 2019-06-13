import java.util.*;


 public class LazyPropagationSegmentTree
 {
	public static void main(String[] args) 
	{
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
	  int arr[]=new int[n];
      int tree[]=new int[4*n];
	  int lazy[]=new int[4*n];
	  Arrays.fill(lazy,0);
      for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	  buildLazyTree(arr,tree,0,n-1,1);
      int q=sc.nextInt();
	  for(int i=0;i<q;i++)
	  {
		  int Q=sc.nextInt();
		  if(Q==0)
		  {
		  int l=sc.nextInt();
		  int r=sc.nextInt();
		  int val=sc.nextInt();
		  updateLazyTree(tree,lazy,0,n-1,l,r,1,val);
		  }
		  else
		  {
		  int l=sc.nextInt();
		  int r=sc.nextInt();
		  System.out.println(queryLazyTree(tree,lazy,0,n-1,l,r,1));
		  }		  
	  }
	}
	  
	  static void buildLazyTree(int arr[],int tree[],int start,int end,int tn)
	  {
	  if(start==end)
	  {
		tree[tn]=arr[start];
		return;
	  }
	  else
	  {
	  int mid=(start+end)/2;
	  buildLazyTree(arr,tree,start,mid,2*tn);
	  buildLazyTree(arr,tree,mid+1,end,2*tn+1);
	  tree[tn]=Math.min(tree[2*tn],tree[2*tn+1]);
	  }
	  }
	  
	  static void updateLazyTree(int tree[],int lazy[],int low,int high,int startR,int endR,int currPos,int incr)
	  {
	  if(low>high)
	  return;
	  
	  if(lazy[currPos]!=0)
	  {
	  tree[currPos]+=lazy[currPos];
	  if(low!=high)
	  {
	  lazy[2*currPos]+=lazy[currPos];
	  lazy[2*currPos+1]+=lazy[currPos];
	  }
	  lazy[currPos]=0;
	  }
	  
	  // No overlap
	  if(startR>high && endR<low)
		return;
		
	//Complete Overlap
	  if(low>=startR && high<=endR)
	  {
	  tree[currPos]+=incr;
	  if(low!=high)
	  {
	  lazy[2*currPos]+=incr;
	  lazy[2*currPos+1]+=incr;
	  }
	  return;
	  }
	  
	  // Partial Overlap
	  int mid=(low+high)/2;
	  updateLazyTree(tree,lazy,low,mid,startR,endR,2*currPos,incr);
	  updateLazyTree(tree,lazy,mid+1,high,startR,endR,2*currPos+1,incr);
	  tree[currPos]=Math.min(tree[2*currPos],tree[2*currPos+1]);
	  }
	  
	  static int queryLazyTree(int tree[],int lazy[],int low,int high,int startR,int endR,int currPos)
	  {
	  if(low>endR || high<startR)
	  return Integer.MAX_VALUE;
	  
	  if(low>=startR && high<=endR)
	  return tree[currPos]+lazy[currPos];
	  
	  int mid=(low+high)/2;
	  int left=queryLazyTree(tree,lazy,low,mid,startR,endR,2*currPos);
	  int right=queryLazyTree(tree,lazy,mid+1,high,startR,endR,2*currPos+1);
	  int ans=Math.min(left+lazy[2*currPos],right+lazy[2*currPos+1]);
	  return ans;
	  }
	  }