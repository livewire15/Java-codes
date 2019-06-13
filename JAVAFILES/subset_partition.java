import java.util.*;
 class subset_partition {
  
  static void subset(int l,int k,int ans[],long sum,String s,int ap[],long total)
  {
    if(l==0)
    {
     if(total==sum && ap[0]==0)
	 {
    //  System.out.println(s);
	  int ptr=0;
	  if(s.charAt(0)=='1')
	  {
		//  System.out.println("hey");
		  Arrays.fill(ans,1);
	  }
	  else
	  {
		  //System.out.println("hey2");
		  ptr=1;
		  Arrays.fill(ans,0);
	  }
	  s=s+" ";
	  int i=0;
	   while(i<s.length())
	   {
			   //System.out.println(s.charAt(i));
			   int index=s.indexOf(' ');
		   String temp=s.substring(i,index);
		  // System.out.println(s+"1");
			i=index+1;
			if(i<s.length())
			{
			s=s.substring(i,s.length());
			//System.out.println(s+"2");
		   int val=Integer.valueOf(temp);
		  ans[val]=ptr;
		  i=0;
		   }
	   }
	   ap[0]=-1;
	   return;
    }
	}
    else
    {
	if(l!=k)
	{
      subset(l-1,k,ans,sum,s,ap,total);
      subset(l-1,k,ans,sum,String.valueOf(l)+" "+s,ap,total+(long)l);       
    }
	else
	 subset(l-1,k,ans,sum,s,ap,total);
	}
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int x=sc.nextInt();
			int n=sc.nextInt();			
		long sum=0;
		sum=(long)(n*(n+1)/2);
		sum=sum-(long)x;
		if(sum%2!=0 || n==2)
			System.out.println("impossible");
		else
		{
			sum=sum/2;
		int ans[]=new int[n+1];
		int ap[]=new int[1];
		ap[0]=0;
		subset(n,x,ans,sum,"",ap,0);
		ans[x]=2;
		String output="";
		for(int i=1;i<ans.length;i++)
			output+=ans[i];
		System.out.println(output);
		}
		t--;
	}
	}
}

