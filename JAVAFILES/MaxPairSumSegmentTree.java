import java.util.Scanner;

class node
{
public int max;
public int smax;
}

public class MaxPairSumSegmentTree
 {
	public static void main(String[] args) 
	{
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];  
      node tree[]=new node[3*n];
	  for(int i=0;i<tree.length;i++)
		  tree[i]=new node();
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int q=sc.nextInt();
      buildTree(arr,tree,0,n-1,1);
	  for(int i=0;i<q;i++)
	  {
	  char ch=sc.next().charAt(0);
	  int l=sc.nextInt();
      int r=sc.nextInt();
        if(ch=='Q')
        {
          l--;
          r--;
		  node ans=query(arr,tree,0,n-1,l,r,1);
          System.out.println(ans.max+ans.smax);
		}
        else
        {
          l--;
          update(arr,tree,0,n-1,1,l,r);
        }
	  }
	  }
	  
	  static void buildTree(int arr[],node tree[],int start,int end,int tn)
	  {
	  if(start==end)
	  {
	  tree[tn].max=arr[start];
	  tree[tn].smax=Integer.MIN_VALUE;
	  }
	  else
	  {
	  int mid=(start+end)/2;
	  buildTree(arr,tree,start,mid,2*tn);
	  buildTree(arr,tree,mid+1,end,2*tn+1);
	  node left=tree[2*tn];
	  node right=tree[2*tn+1];
	  tree[tn].max=Math.max(left.max,right.max);
	  tree[tn].smax=Math.min(Math.max(left.max,right.smax),Math.max(right.max,left.smax));
	  }
	  }
	  
	  static node query(int arr[],node tree[],int start,int end,int l,int r,int tn)
	  {
		  node temp=new node();
		  node ans=new node();
		  temp.max=temp.smax=Integer.MIN_VALUE;
	  if(start>r || end<l)
	  return temp;
	  else if(start>=l && end<=r)
	  return tree[tn];
	  else
	  {
	  int mid=(start+end)/2;
	  node left=query(arr,tree,start,mid,l,r,2*tn);
	  node right=query(arr,tree,mid+1,end,l,r,2*tn+1);
	  ans.max=Math.max(left.max,right.max);
	  ans.smax=Math.min(Math.max(left.max,right.smax),Math.max(left.smax,right.max));
	  return ans;
	  }
	  }
	  
	static void update(int arr[],node tree[],int start,int end,int tn,int idx,int value)
  {
   	if(start==end)
    {
  	 arr[idx]=value;
	tree[tn].max=value;
    }
    else
    {
      int mid=(start+end)/2;
	  if(idx<=mid)
		update(arr,tree,start,mid,2*tn,idx,value);
	else
		update(arr,tree,mid+1,end,2*tn+1,idx,value);
      node left=tree[2*tn];
	  node right=tree[2*tn+1];
	  tree[tn].max=Math.max(left.max,right.max);
	  tree[tn].smax=Math.min(Math.max(left.max,right.smax),Math.max(right.max,left.smax));
    }
  }
}