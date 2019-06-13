import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class matrix_land {

    static void matrixLand(int[][] A,int x,int y,int n,int m,int sum,int max) {
        // Complete this function
        if(x==n-1 && A[x][y]==0)
        {
            if(sum>max)
                max=sum;
			return;
        }
        
        if(x>n-1 || y>m-1 || A[x][y]==0)
			return;
  
        else
        {
			if(A[x][y]!=0)
			{
			sum=sum+A[x][y];
            A[x][y]=0;
			}
            matrixLand(A,x,y+1,n,m,sum,max);   
			matrixLand(A,x,y-1,n,m,sum,max);			
            matrixLand(A,x+1,y,n,m,sum,max);
        }
		System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] A = new int[n][m];
        for(int A_i = 0; A_i < n; A_i++){
            for(int A_j = 0; A_j < m; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        matrixLand(A,0,0,n,m,0,0);
       // System.out.println(result);
        in.close();
    }
}
