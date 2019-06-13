import java.util.*;
class Pipes {	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int sol[][]=new int[3][n];
		char maze[][]=new char[3][n];
		int i=0;
		while(i<3)
		{
		String a=sc.next();
		for(int k=0;k<n;k++)
		{
		maze[i][k]=a.charAt(k);
		}
		i++;
		}
		int count[]={0};
		rat(maze,n,0,0,1,count,sol);
		System.out.println(count[0]);
		t--;
	}
	}
  
  static void rat(char maze[][],int n,int i,int j,int p,int count[],int sol[][])
  {
    if(i==2 && j==n-1 && p==3)//base condition if destination is reached
    {
		sol[i][j]=1;
		count[0]++;
		//System.out.println("hey");
		return;
    }
    
    if(i>=3 || j>=n || i<0 || j<0 || maze[i][j]=='#' || sol[i][j]==1)//constraints
      return;
    
	sol[i][j]=1;
    if(p==1)
	{
    rat(maze,n,i+1,j,3,count,sol);
    rat(maze,n,i+1,j,4,count,sol);
	}
	else if(p==2 || p==3)
	{
	rat(maze,n,i,j+1,1,count,sol);
    rat(maze,n,i,j+1,4,count,sol);
	}
	else
	{
	rat(maze,n,i-1,j,1,count,sol);
    rat(maze,n,i-1,j,2,count,sol);
	}
	sol[i][j]=0;
  }
  
}
