import java.util.*;
public class sudoku_solver 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int board[][]=new int[9][9];
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				board[i][j]=sc.nextInt();
			}
		}
		sudokuSolver(board);
		//System.out.println(ans);
	}
	
	public static void sudokuSolver(int board[][]){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Don't print output and return output as specified in the question.
	 */
	 boolean flag=true;
	 for(int i=0;i<9;i++)
	 {
		 for(int j=0;j<9;j++)
		 {
			 if(board[i][j]==0)
			 {
				 flag=false;
				 for(int k=1;k<=9;k++)
				 {
					if(isPossible(board,i,j,k))
					{
						board[i][j]=k;
						sudokuSolver(board);
						board[i][j]=0;
					}
				 }
			 }
		 }
	 }
	 if(flag)
	 {
	 for(int i1=0;i1<9;i1++)
	 {
		 for(int j1=0;j1<9;j1++)
		 {
			 System.out.print(board[i1][j1]);
		 }
		 System.out.println();
	 }
}
	}
      
  /*static void sudoku(int board[][],int x,int y)
  {	
    if(x==8 && y>8)
	{
		System.out.println();
		for(int i1=0;i1<9;i1++)
		{
			for(int j1=0;j1<9;j1++)
			{
				System.out.print(board[i1][j1]+" ");
			}
			System.out.println();
		}
		//System.exit(0);
      //return true;
	}
	
      if(y>8)
	  {
		 sudoku(board,x+1,0);
	  }
 
	  if(board[x][y]==0)
	{
        for(int i=1;i<=9;i++)
        {
          if(isPossible(board,x,y,i))
          {
            board[x][y]=i;
            sudoku(board,x,y+1);  
			board[x][y]=0;	
				//System.out.println("h");
          }
        }	 
	  }
	 sudoku(board,x,y+1);
  }	*/
  
  static boolean isPossible(int board[][],int x,int y,int k)
  {
    for(int j=x-1;j>=0;j--)//checking vertical columns
    {
      if(board[j][y]==k)
        return false;
    }
    
    for(int j=y-1;j>=0;j--)//checking horizontal row
	{
		if(board[x][j]==k)
			return false;
	}
	
	x=x-x%3;
	y=y-y%3;
	for(int i=x;i<x+3;i++)//checking inner box
	{
		for(int j=y;j<y+3;j++)
		{
			if(board[i][j]==k)
				return false;
		}
	}
	
    return true;
  }
}




/*
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0

3 1 6 5 2 8 4 7 9
5 2 1 3 4 6 7 8 0
1 8 7 2 3 4 5 3 1
2 3 3 1 1 5 6 8 4
9 4 2 8 6 3 1 5 5
4 5 8 6 9 1 6 2 3
1 3 4 7 5 2 2 5 6
6 7 5 4 8 9 3 7 4
7 6 5 2 0 6 3 1 8
*/
