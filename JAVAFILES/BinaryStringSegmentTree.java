import java.util.Scanner;


 public class BinaryStringSegmentTree
 {
	public static void main(String[] args) 
	{
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int tree[]=new int[4*n];
      String str=sc.next();
      int q=sc.nextInt();
      buildTree(str,tree,0,n-1,1);
	  for(int i=1;i<tree.length;i++)
	  {
		  System.out.println(tree[i]);
	  }
	  for(int i=0;i<q;i++)
	  {
      int Q=sc.nextInt(); 
      if(Q==0)
      {
        int l=sc.nextInt();
      	int r=sc.nextInt();
        int ans=query(str,tree,0,n-1,l,r,1);
      	System.out.println(ans);
      }
        else
        {
          int l=sc.nextInt();
          update(str,tree,0,n-1,1,l);
	  	}
      }
    }
	  
	  static void buildTree(String str,int tree[],int start,int end,int tn)
	  {
	  if(start==end)
	  {
	  if(str.charAt(start)=='1')
        tree[tn]=1;
        else
        tree[tn]=0;
	  }
	  else
	  {
	  int mid=(start+end)/2;
	  buildTree(str,tree,start,mid,2*tn);
	  buildTree(str,tree,mid+1,end,2*tn+1);
	  int left=tree[2*tn];
	  int right=tree[2*tn+1];
	  tree[tn]=(right%3+((int)Math.pow(2,end-mid)*(left%3))%3)%3;
	  }
      }
	  
	  static int query(String str,int tree[],int start,int end,int l,int r,int tn)
	  {        
	  if(start>r || end<l)
	  return 0;
	  else if(start>=l && end<=r)
	  return tree[tn]%3;
	  else
	  {
	  int mid=(start+end)/2;
	  int left=query(str,tree,start,mid,l,r,2*tn);
	  int right=query(str,tree,mid+1,end,l,r,2*tn+1);
      return (right%3+((int)Math.pow(2,r-mid)*(left%3))%3)%3;
	  }
   	  }
   
   static void update(String str,int tree[],int start,int end,int tn,int idx)
  {
   	if(start==end)
    {
  	 if(tree[tn]==0)
     {
       str=str.substring(0,start)+"1"+str.substring(start+1);
       tree[tn]=1;
   	 }
    }
    else
    {
      int mid=(start+end)/2;
	  if(idx<=mid)
		update(str,tree,start,mid,2*tn,idx);
	else
		update(str,tree,mid+1,end,2*tn+1,idx);
      int left=tree[2*tn];
	  int right=tree[2*tn+1];
	  tree[tn]=(right%3+((int)Math.pow(2,end-mid)*(left%3))%3)%3;
    }
  }
}