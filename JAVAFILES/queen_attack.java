import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queen_attack {

    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rq = in.nextInt();
        int cq = in.nextInt();
		int squares=0,row=0,col=0;
		if(k==0)
		{
			squares+=n-1;
			squares+=n-1;
			row=rq;
			col=cq;
			while(row<=n && col<=n)
			{
			row++;
			col++;
			squares++;
			}
			squares-=1;
			
			row=rq;
			col=cq;
			while(row>0 && col>0)
			{
			row--;
			col--;
			squares++;
			}
			squares-=1;
			
			
			row=rq;
			col=cq;
			while(row<=n && col>0)
			{
			row++;
			col--;
			squares++;
			}
			squares-=1;
			row=rq;
			col=cq;
			
			while(row>0 && col<=n)
			{
			row--;
			col++;
			squares++;
			}
			squares-=1;
		}
		
        for(int a0 = 0; a0 < k; a0++)
		{
            int ro = in.nextInt();
            int co = in.nextInt();
			row=0;
			col=0;
            // your code goes here
			if(ro==rq && co!=cq)
			{
			squares+=n-1;
			squares+=n-2;
			row=rq;
			col=cq;
			while(row<=n && col<=n)
			{
			row++;
			col++;
			squares++;
			}
			squares-=1;
			
			row=rq;
			col=cq;
			while(row>0 && col>0)
			{
			row--;
			col--;
			squares++;
			}
			squares-=1;
			
			
			row=rq;
			col=cq;
			while(row<=n && col>0)
			{
			row++;
			col--;
			squares++;
			}
			squares-=1;
			row=rq;
			col=cq;
			
			while(row>0 && col<=n)
			{
			row--;
			col++;
			squares++;
			}
			squares-=1;
			}
			
			else if(co==cq && ro!=rq)
			{
			squares+=n-2;
			squares+=n-1;
			row=rq;
			col=cq;
			while(row<=n && col<=n)
			{
			row++;
			col++;
			squares++;
			}
			squares-=1;
			
			row=rq;
			col=cq;
			while(row>0 && col>0)
			{
			row--;
			col--;
			squares++;
			}
			squares-=1;
			
			row=rq;
			col=cq;
			while(row<=n && col>0)
			{
			row++;
			col--;
			squares++;
			}
			squares-=1;
			
			row=rq;
			col=cq;
			while(row>0 && col<=n)
			{
			row--;
			col++;
			squares++;
			}
			squares-=1;
        }
		
		else if(ro!=rq && co!=cq)
		{
		squares+=n-1;
		squares+=n-1;
		row=rq;
		col=cq;
		int flag=0;
			while(row<=n && col<=n)
			{
			row++;
			col++;
			if(row==ro && col==co)
			{
			flag=1;
			break;
			}
			squares++;
			}
			if(flag==0)
			squares-=1;
			
			row=rq;
			col=cq;
			flag=0;
			while(row>0 && col>0)
			{
			row--;
			col--;
			if(row==ro && col==co)
			{
			flag=1;
			break;
			}
			squares++;
			}
			if(flag==0)
			squares-=1;
			
			
			row=rq;
			col=cq;
			 flag=0;
			while(row<=n && col>0)
			{
			row++;
			col--;
			if(row==ro && col==co)
			{
			flag=1;
			break;
			}
			squares++;
			}
			if(flag==0)
			squares-=1;
			
			
			row=rq;
			col=cq;
			 flag=0;
			while(row>0 && col<=n)
			{
			row--;
			col++;
			if(row==ro && col==co)
			{
			flag=1;
			break;
			}
			squares++;
			}
			if(flag==0)
			squares-=1;
			
		}		
    }
			System.out.println(squares);
}
}