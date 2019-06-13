import java.util.Scanner;

class node
{
int A;
int B;
int index;
}

 public class MaxABValueSegmentTree
 {
	public static void main(String[] args) 
	{
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arrA[]=new int[n];  
      int arrB[]=new int[n];
      node tree[]=new node[4*n];
	  for(int i=0;i<tree.length;i++)
		  tree[i]=new node();
      for(int i=0;i<n;i++)
      {
        arrA[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        arrB[i]=sc.nextInt();
      }
      int q=sc.nextInt();
      buildTree(arrA,arrB,tree,0,n-1,1);
	  for(int i=0;i<q;i++)
	  {
	  int l=sc.nextInt();
      int r=sc.nextInt();
      l--;
      r--;
	  node ans=query(arrA,arrB,tree,0,n-1,l,r,1);
      System.out.println(ans.index+1);
      }
	  }
	  
	  static void buildTree(int arrA[],int arrB[],node tree[],int start,int end,int tn)
	  {
	  if(start==end)
	  {
	  tree[tn].A=arrA[start];
      tree[tn].B=arrB[start];
      tree[tn].index=start;
	  }
	  else
	  {
	  int mid=(start+end)/2;
	  buildTree(arrA,arrB,tree,start,mid,2*tn);
	  buildTree(arrA,arrB,tree,mid+1,end,2*tn+1);
	  node left=tree[2*tn];
	  node right=tree[2*tn+1];
	  if(left.A>right.A)
      {
        tree[tn].A=left.A;
        tree[tn].B=left.B;
        tree[tn].index=left.index;
      }
      else if(left.A<right.A)
      {
      	tree[tn].A=right.A;
        tree[tn].B=right.B;
        tree[tn].index=right.index;
      }
      else
      {
        if(left.B<right.B)
        {
        tree[tn].A=left.A;
        tree[tn].B=left.B;
        tree[tn].index=left.index;
        }
        else if(left.B>right.B)
        {
        tree[tn].A=right.A;
        tree[tn].B=right.B;
        tree[tn].index=right.index;
        }
        else
        {
        tree[tn].A=left.A;
        tree[tn].B=left.B;
        tree[tn].index=left.index;
        }
      }
	  }
	  }
	  
	  static node query(int arrA[],int arrB[],node tree[],int start,int end,int l,int r,int tn)
	  {
		  node temp=new node();
		  node ans=new node();
		  temp.A=Integer.MIN_VALUE;
          temp.B=Integer.MAX_VALUE;
          temp.index=-1;
	  if(start>r || end<l)
	  return temp;
	  else if(start>=l && end<=r)
	  return tree[tn];
	  else
	  {
	  int mid=(start+end)/2;
	  node left=query(arrA,arrB,tree,start,mid,l,r,2*tn);
	  node right=query(arrA,arrB,tree,mid+1,end,l,r,2*tn+1);
	  if(left.A>right.A)
      {
        ans.A=left.A;
        ans.B=left.B;
        ans.index=left.index;
      }
      else if(left.A<right.A)
      {
      	ans.A=right.A;
        ans.B=right.B;
        ans.index=right.index;
      }
      else
      {
        if(left.B<right.B)
        {
        ans.A=left.A;
        ans.B=left.B;
        ans.index=left.index;
        }
        else if(left.B>right.B)
        {
        ans.A=right.A;
        ans.B=right.B;
        ans.index=right.index;
        }
        else
        {
        ans.A=left.A;
        ans.B=left.B;
        ans.index=left.index;
        }
      }
      return ans;
	}
   }
}