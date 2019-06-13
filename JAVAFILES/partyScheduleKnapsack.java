import java.util.Scanner;

public class partyScheduleKnapsack {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      while(true)
      {
      int budget=sc.nextInt();
      int n=sc.nextInt();
      if(budget!=0 && n!=0)
      {
      int rupee[]=new int[n];
      int fun[]=new int[n];
      for(int i=0;i<n;i++)
      {
        rupee[i]=sc.nextInt();
        fun[i]=sc.nextInt();
      }
      func(rupee,fun,n,budget,0); 
	  }
        else
          break;
      }
    }
  
  static void func(int rupee[],int fun[],int n,int budget,int sum)
  {
   int ans[][]=new int[n+1][budget+1];
    for(int i=0;i<=n;i++)
    {
      ans[i][0]=0;
    }
    
    for(int j=0;j<=budget;j++)
    {
      ans[0][j]=0;
    }
    
    int fees=0;
    for(int i=1;i<=n;i++)
    {
      for(int j=0;j<=budget;j++)
      {
        ans[i][j]=ans[i-1][j];
        if(rupee[i-1]<j)
        {
          ans[i][j]=Math.max(ans[i][j],fun[i-1]+ans[i-1][j-rupee[i-1]]);
      }
    }
    }
	int totalfun=ans[n][budget];
	int i=0;
	for(i=0;i<=budget;i++)
	{
		if(ans[n][i]==totalfun)
			break;
	}
    System.out.println(i-1+" "+ans[n][budget]);
  }
}