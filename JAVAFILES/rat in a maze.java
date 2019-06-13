
public class Solution {
	
	
	
	public static void ratInAMaze(int maze[][]){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
      int sol[][]=new int[maze.length][maze.length];
		rat(maze,maze.length,0,0,sol);
	}
  
  static void rat(int maze[][],int n,int i,int j,int sol[][])
  {
    if(i==n-1 && j==n-1)//base condition if destination is reached
    {
      sol[i][j]=1;
      for(int x=0;x<n;x++)
      {
        for(int y=0;y<n;y++)
        {
          System.out.print(sol[x][y]+" ");
        }
      }
      System.out.println();
      System.out.println();
      return;
    }
    
    if(i>=n || j>=n || i<0 || j<0 || sol[i][j]==1 || maze[i][j]==0)//constraints
      return;
    
    sol[i][j]=1;
    rat(maze,n,i-1,j,sol);//move upwards
    rat(maze,n,i+1,j,sol);//down
    rat(maze,n,i,j-1,sol);//left
    rat(maze,n,i,j+1,sol);//right
    sol[i][j]=0;//on backtracking change index again to 0 to explore further solutions
  }
  
}
