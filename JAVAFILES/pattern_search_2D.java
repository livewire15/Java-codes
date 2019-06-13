import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pattern_search_2D {

    static String gridSearch(String[] G, String[] P,int R,int C,int r,int c) {
        // Complete this function
        int f=0,flag=0;
        for(int i=0;i<=R-r;i++)
        {
            for(int j=0;j<=C-c;j++)
            {
                if(G[i].substring(j,j+c).equals(P[0].substring(0)))
                {
					//System.out.println("hey");
                    flag=0;
                    for(int k=i+1,k1=1;k<(i+r) && k1<r;k++,k1++)
                    {
                        if(G[k].substring(j,j+c).equals(P[k1].substring(0)))
                            flag++;
                    }
                    if(flag==r-1)
                    {
                        f=-1;
                        break;
                    }   
                    
                }
            }
            if(f==-1)
                break;
        }
        
		//System.out.println(flag);
        if(f==-1)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();             
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
			
            String result = gridSearch(G, P,R,C,r,c);
            System.out.println(result);
        }
        in.close();
    }
}
