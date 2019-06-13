import java.util.Scanner;

public class test30 {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int arr[][]=new int[n+1][m+1];
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=m;j++)
        {
          arr[i][j]=sc.nextInt();
        }
      }
      int dx=sc.nextInt();
      int dy=sc.nextInt();
      int J=sc.nextInt();
      fun(arr,n,m,dx,dy,J,""); 
	}
  
  static void fun(int arr[][],int n,int m,int dx,int dy,int J,String ans)
  {
    if(dx==1 || dy==1 || dx==n || dy==m)
    {
      ans=ans+(String.valueOf(dx))+(String.valueOf(dy));
      System.out.println("YES");
      System.out.println(ans.length()/2);
      for(int i=0;i<ans.length()-1;i=i+2)
      {
        System.out.println(ans.charAt(i)+" "+ans.charAt(i+1));
      }
      System.exit(0);
    }
    
    if(dx<1 || dy<1 || dx>n || dy>m)
    {
      return;
    }
    
    if((arr[dx][dy]-arr[dx+1][dy])>=0 && (arr[dx][dy]-arr[dx+1][dy])<=J)
    {
    	 //System.out.println("h1");
      fun(arr,n,m,dx+1,dy,J,ans+(String.valueOf(dx))+(String.valueOf(dy)));
     
      //return;
    }
    
    if((arr[dx][dy]-arr[dx-1][dy])>=0 && (arr[dx][dy]-arr[dx-1][dy])<=J)
    {
    	//System.out.println("h2");
      fun(arr,n,m,dx-1,dy,J,ans+(String.valueOf(dx))+(String.valueOf(dy)));
      
      //return;
    }
    
    if((arr[dx][dy]-arr[dx][dy+1])>=0 && (arr[dx][dy]-arr[dx][dy+1])<=J)
    {
    	//System.out.println("h3");
      fun(arr,n,m,dx,dy+1,J,ans+(String.valueOf(dx))+(String.valueOf(dy)));
      
      //return;
    }
    
    if((arr[dx][dy]-arr[dx][dy-1])>=0 && (arr[dx][dy]-arr[dx][dy-1])<=J)
    {
    	//System.out.println("h4");
      fun(arr,n,m,dx,dy-1,J,ans+(String.valueOf(dx))+(String.valueOf(dy)));
      
      //return;
    }
    
    System.out.println("NO");
  }
}
