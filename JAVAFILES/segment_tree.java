import java.util.*;
class segment_tree
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5};//n size
int tree[]=new int[10];//2n size
buildTree(arr,tree,0,4,1);
updateTree(arr,tree,0,4,1,4,10);
int ans=query(arr,tree,0,4,1,2,4);
for(int i=1;i<10;i++)
{
System.out.print(tree[i]+" ");
}
System.out.println();
System.out.println(ans);
}

static void buildTree(int arr[],int tree[],int start,int end,int treenode)
{	//O(n) time is taken to build segment tree.
if(start==end)
{
tree[treenode]=arr[start];
}
else
{
int mid=(start+end)/2;
buildTree(arr,tree,start,mid,2*treenode);
buildTree(arr,tree,mid+1,end,2*treenode+1);
tree[treenode]=tree[2*treenode]+tree[2*treenode+1];
}
}

static void updateTree(int arr[],int tree[],int start,int end,int treenode,int idx,int value)
{
	//since change will always be made in the leaf node(base case)..therefore change is to be made
//in the array itself that will further reflect on the segment tree.
	
	if(start==end)//means leaf node is reached
	{
		arr[idx]=value;//update value in array
		tree[treenode]=value;
		return;
	}
	else
	{
		int mid=(start+end)/2;
		if(idx>mid)
			updateTree(arr,tree,mid+1,end,2*treenode+1,idx,value);
		else
			updateTree(arr,tree,start,mid,2*treenode,idx,value);
		
		tree[treenode]=tree[2*treenode]+tree[2*treenode+1];
	}
}

static int query(int arr[],int tree[],int start,int end,int treenode,int left,int right)
{
	if(start>right || end<left)
		return 0;
	else if(start>=left && end<=right)
		return tree[treenode];
	else
	{
		int mid=(start+end)/2;
		int ans1=query(arr,tree,start,mid,2*treenode,left,right);
		int ans2=query(arr,tree,mid+1,end,2*treenode+1,left,right);
		return ans1+ans2;
	}
}
}