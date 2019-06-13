import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chess {

    static int waysToGiveACheck(char[][] board) {
        // Complete this function
        int count=0,ans=0;
		//System.out.println("i=");
        for(int i=0;i<8;i++)
        {
			//System.out.println("i="+i);
            if(board[1][i]=='P' && board[0][i]=='#')
            {
				if(isValid(i,board))
				{
					ans=exCheck(i,board);									
                int j=0;
                while(j<2)
                {
                 if(j==0)//horse
                 {
                     if((i-2)>=0)
                     {
                         if(board[1][i-2]=='k')
                         {
                             count++;
                             break;
                         }
                     }
                     if((i+2)<=7)
                     {
                         if(board[1][i+2]=='k')
                         {
                             count++;
                             break;
                         }
                     }
                     if((i-1)>=0)
                     {
                         if(board[2][i-1]=='k')
                         {
                             count++;
                             break;
                         }
                     }
                     if((i+1)<=7)
                     {
                         if(board[2][i+1]=='k')
                         {
                             count++;
                             break;
                         }
                     }                                           
                 }
                    
                    if(j==1)//queen
                    {
                        int flag=0;
                        if((i-1)>=0)
                        {
                            for(int x=1,y=i-1;x<=7 && y>=0;x++,y--)
                            {
                                if(board[x][y]=='#')
                                    continue;
                                else if(board[x][y]=='k')
                                {
                                    count+=2;
                                    flag=1;//coz bishop(uut)can also give a check diagonally.
                                    break;
                                }
                                else
                                {
                                    break;
                                }
                            }
                        }
                        
                          if(flag==0 && (i+1)<=7)
                          {
                            for(int x=1,y=i+1;x<=7 && y<=7;x++,y++)
                            {
                                if(board[x][y]=='#')
                                    continue;
                                else if(board[x][y]=='k')
                                {
                                    count+=2;
                                    flag=1;//coz bishop(uut)can also give a check diagonally.
                                    break;
                                }
                                else
                                {
                                    break;
                                }
                            }
                           }
                        
                            if(flag==0)
                            {
                                for(int x=1;x<=7;x++)
                                {
                                    if(board[x][i]=='#')
                                        continue;
                                else if(board[x][i]=='k')
                                {
                                    count+=2;
                                    flag=1;//coz elephant can also give a check.
                                    break;
                                }
                                else
                                {
                                    break;
                                }
                               }
                            }                           
                    }
                    j++;
                }
            }
        }
    }
      return ans+count;
	}
	
	static boolean isValid(int i,char board[][])
	{
		if((i-1)>=0)
				{
					if(board[0][i-1]=='q' || board[0][i-1]=='b')
					{
						for(int x=2,y=i+1;x<=7 && y<=7;x++,y++)//right diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='K')
								return false;
							else
								break;
						}
					}
					if(board[0][i-1]=='K')
					{
						for(int x=2,y=i+1;x<=7 && y<=7;x++,y++)//right diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='q' || board[0][i-1]=='b')
								return false;
							else
								break;
						}
					}
				}				
				if((i+1)>=7)
				{
					if(board[0][i+1]=='q' || board[0][i+1]=='b')
					{
						for(int x=2,y=i-1;x<=7 && y>=0;x++,y--)//left diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='K')
								return false;
							else
								break;
						}
					}
					 if(board[0][i+1]=='K')
					{
						for(int x=2,y=i-1;x<=7 && y>=0;x++,y--)//left diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='q' || board[x][y]=='b')
								return false;
							else
								break;
						}
					}
				}				
				int p1=0,p2=0;
				for(int x=0;x<=7;x++)//horizontally
				{
					if(board[1][x]=='q')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='K')
							 return false;
						 else
							 break;
						}
					}
					else if(board[1][x]=='r')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='K')
							 return false;
						 else
							 break;
						}
					}
					else if(board[1][x]=='K')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='q' || board[1][y]=='r')
							 return false;
						 else
							 break;
						}
					}
				}
				return true;
	}

	static int exCheck(int i,char board[][])
	{
		int count=0;
			if((i-1)>=0)
					{
					if(board[0][i-1]=='Q' || board[0][i-1]=='B')
					{
						for(int x=2,y=i+1;x<=7 && y<=7;x++,y++)//right diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='k')
							{
								count++;
								break;
							}
							else
								break;
						}
					}
					if(board[0][i-1]=='k')
					{
						for(int x=2,y=i+1;x<=7 && y<=7;x++,y++)//right diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='Q' || board[0][i-1]=='B')
							{
								count++;
								break;
							}
							else
								break;
						}
					}
				}				
				if((i+1)>=7)
				{
					if(board[0][i+1]=='Q' || board[0][i+1]=='B')
					{
						for(int x=2,y=i-1;x<=7 && y>=0;x++,y--)//left diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='k')
							{
								count++;
								break;
							}
							else
								break;
						}
					}
					 if(board[0][i+1]=='k')
					{
						for(int x=2,y=i-1;x<=7 && y>=0;x++,y--)//left diagonal
						{
							if(board[x][y]=='#')
								continue;
							else if(board[x][y]=='Q' || board[x][y]=='B')
							{
								count++;
								break;
							}
							else
								break;
						}
					}
				}				
				for(int x=0;x<=7;x++)//horizontally
				{
					if(board[1][x]=='Q')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='k')
							{
								count++;
								break;
							}
						 else
							 break;
						}
					}
					else if(board[1][x]=='R')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='k')
							{
								count++;
								break;
							}
						 else
							 break;
						}
					}
					else if(board[1][x]=='k')
					{
						for(int y=x+1;y<=7;y++)
						{
							if(board[1][y]=='#')
								continue;
						 else if(board[1][y]=='Q' || board[1][y]=='R')
							{
								count++;
								break;
							}
						 else
							 break;
						}
					}
				}
				return count;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            char[][] board = new char[8][8];
            for(int board_i = 0; board_i < 8; board_i++){
				String str=in.next();
                for(int board_j = 0; board_j < 8; board_j++){
                    board[board_i][board_j] = str.charAt(board_j);					
                }		
            }
            int result = waysToGiveACheck(board);
            System.out.println(result);
        }
        in.close();
    }
}
