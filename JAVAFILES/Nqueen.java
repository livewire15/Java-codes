
public class Solution {
	
		
public static void placeNQueens(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
  int board[][]=new int[n][n];
		Nqueens(n,0,board);
	}
  
  static void Nqueens(int n,int row,int board[][])
  {
    if(row==n)//Base condition
    {
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(board[i][j]+" ");
        }
      }
      System.out.println();
    }
    else
    {
    for(int j=0;j<n;j++)
    {
      if(isPossible(n,row,j,board))//checking if it is possible to insert the queen in this position
      {
        board[row][j]=1;//if possible then insert 1 to its index
        Nqueens(n,row+1,board);//recursion
        board[row][j]=0;//then backtracking starts and update its index to 0 to check further solutions
      }
    }
  }
  }
  
  static boolean isPossible(int n,int row,int col,int board[][])
  {
    for(int i=row-1;i>=0;i--)//to check vertical in same column
    {
      if(board[i][col]==1)
        return false;
    }
    
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)//to check for upper left diagonal
    {
      if(board[i][j]==1)
        return false;
    }
    
    for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)//to check for upper right diagonal
    {
      if(board[i][j]==1)
        return false;
    }
    return true;
  }	
}
