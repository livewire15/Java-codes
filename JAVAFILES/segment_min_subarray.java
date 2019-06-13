import java.util.Scanner;
public class Main {
	
	//MOST IMPORTANT
//segment tree mein main cheez yahi rehti ki tree ke node pe kaunsi value save honi chahiye aur uske upar wale node pr
//kya store krana chahiye(it can be sum of both the nodes,or min value,or max value).

	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];  
      int tree[]=new int[4*n];
      int q=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      //sc.nextLine();
      buildTree(arr,tree,n,0,n-1,1);
      while(q>0)
      {
        char ch=sc.next().charAt(0);
        int l=sc.nextInt();
        int r=sc.nextInt();
        if(ch=='q')
        {
          l--;
          r--;
          System.out.println(minimum(arr,tree,0,n-1,l,r,1,100000));
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
      tree[tn]=arr[start];
    }
    else
    {
      int mid=(start+end)/2;
      buildTree(arr,tree,n,start,mid,2*tn);
      buildTree(arr,tree,n,mid+1,end,2*tn+1);
      tree[tn]=Math.min(tree[2*tn],tree[2*tn+1]);
    }
  }
  
  static int minimum(int arr[],int tree[],int start,int end,int l,int r,int tn,int min)
  {
    if(start>r || end<l)
      return Integer.MAX_VALUE;
  
    else if(start>=l && end<=r)
    {
      	return tree[tn];
    }
    else
    {
      int mid=(start+end)/2;
      int op1=minimum(arr,tree,start,mid,l,r,2*tn,min);
      int op2=minimum(arr,tree,mid+1,end,l,r,2*tn+1,min);
      return Math.min(op1,op2);
    }      
  }
  
  static void update(int arr[],int tree[],int start,int end,int tn,int idx,int val)
  {
   	if(start==end)
    {
      arr[idx]=val;
      tree[tn]=val;
    }
    else
    {
      int mid=(start+end)/2;
	  if(idx<=mid)
		update(arr,tree,start,mid,2*tn,idx,val);
	else
		update(arr,tree,mid+1,end,2*tn+1,idx,val);
      tree[tn]=Math.min(tree[2*tn],tree[2*tn+1]);
    }
  }

}