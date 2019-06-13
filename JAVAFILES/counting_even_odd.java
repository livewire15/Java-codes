import java.util.Scanner;

public class counting_even_odd {

	
	public static void main(String[] args) {
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];  
      int tree[]=new int[4*n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int q=sc.nextInt();
      buildTree(arr,tree,n,0,n-1,1);
      
      while(q>0)
      {
        int num=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        if(num==1)
        {
          l--;
          r--;
          System.out.println((r-l+1)+query(arr,tree,0,n-1,l,r,1));
		}
        else if(num==2)
        {
          l--;
          r--;
          System.out.println(query(arr,tree,0,n-1,l,r,1));
        }
        else
        {
          l--;
          update(arr,tree,0,n-1,1,l,r);
        }
        q--;
      }
    }
      
    static void buildTree(int arr[],int tree[],int n,int start,int end,int tn)
  {
    if(start==end)
    {
      if(arr[start]%2!=0)
        tree[tn]=1;
      else
        tree[tn]=0;
    }
    else
    {
      int mid=(start+end)/2;
      buildTree(arr,tree,n,start,mid,2*tn);
      buildTree(arr,tree,n,mid+1,end,2*tn+1);
      tree[tn]=tree[2*tn]+tree[2*tn+1];
    }
  }
      
  static int query(int arr[],int tree[],int start,int end,int l,int r,int tn)
  {
    if(start>r || end<l)
      return 0;
    else if(start>=l && end<=r)
    {
		return tree[tn];
    }
    else
    {
      int mid=(start+end)/2;
      int op1=query(arr,tree,start,mid,l,r,2*tn);
      int op2=query(arr,tree,mid+1,end,l,r,2*tn+1);
      return op1+op2;
    }
  }
     
   static void update(int arr[],int tree[],int start,int end,int tn,int idx,int val)
  {
   	if(start==end)
    {
      if(start==idx)
      {
       if(val%2!=0)
         tree[tn]=1;
      else
        tree[tn]=0;
      }
    }
    else
    {
      int mid=(start+end)/2;
	  if(idx<=mid)
		update(arr,tree,start,mid,2*tn,idx,val);
	else
		update(arr,tree,mid+1,end,2*tn+1,idx,val);
      tree[tn]=tree[2*tn]+tree[2*tn+1];
    }
  }
           
}