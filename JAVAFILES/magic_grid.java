import java.util.Scanner;

public class magic_grid {

	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int op[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            arr[i][j]=sc.nextInt();
          }
        }
        op[r-1][c-1]=1;
        op[r-1][c-2]=1;
        op[r-2][c-1]=1;      
        
        for(int i=c-3;i>=0;i--)
        {
          op[r-1][i]=op[r-1][i+1]-arr[r-1][i+1];
        }
        for(int j=r-3;j>=0;j--)
        {
          op[j][c-1]=op[j+1][c-1]-arr[j+1][c-1];
        }
        
        for(int i=r-2;i>=0;i--)
        {
          for(int j=c-2;j>=0;j--)
          {
            if((op[i+1][j]-arr[i+1][j])<(op[i][j+1]-arr[i][j+1]))
            {
              op[i][j]=op[i+1][j]-arr[i+1][j];
			  if(op[i][j]<=0)
				  op[i][j]=1;
            }
            else
            {
              op[i][j]=op[i][j+1]-arr[i][j+1];
			  if(op[i][j]<=0)
				op[i][j]=1;
            }
          }
        }
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
        System.out.print(op[i][j]+" ");
      }
	   System.out.println();
      }
	  t--;
	}
	}
}

		
