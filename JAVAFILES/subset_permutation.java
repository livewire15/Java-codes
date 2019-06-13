import java.util.*;
class subset_permutation{
  
  static void subset(int l,long k,int ap[],String s,long sum)
  {
	
    if(ap[0]==-1)
    {
     if(sum==k)
	 {
		 s=s.trim();
		 int x=Character.getNumericValue(s.charAt(s.length()-1))-1;
		 s=s+" "+String.valueOf(x);
       System.out.println(s);
	   ap[0]=0;
	   return;
	 }
	}
	if(l==1 || sum>k || ap[0]==0)
		  return;
  else
    {
      subset(l-1,k,ap,s,sum);
      subset(l-1,k,ap,s+" "+l,sum+l);       
    }
    }
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int ap[]=new int[1];
	
	while(t>0)
	{
		ap[0]=-1;
		int n=sc.nextInt();
		long k=sc.nextLong();
		if(n==1)
			System.out.println(0);
		else
		{
		subset(n,k,ap,"",0);
		if(ap[0]==-1)
			System.out.println(-1);
		}
		t--;
	}
	}
	}

