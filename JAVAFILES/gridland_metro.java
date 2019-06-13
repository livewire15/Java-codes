import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gridland_metro {

    static long gridlandMetro(int n, int m, int k, int[][] track) {
        // Complete this function
        int arr[][]=new int[n][3];
        for(int i=0;i<k;i++)
        {
          if(arr[track[i][0]][2]==0)
          {
              arr[track[i][0]][0]=track[i][1];
              arr[track[i][0]][1]=track[i][2];
              arr[track[i][0]][2]=track[i][2]-track[i][1]+1;
          }
            else
            {
                if((track[i][1]>=arr[track[i][0]][0] && track[i][1]<=arr[track[i][0]][1]) && (track[i][2]>=arr[track[i][0]][0] && track[i][2]<=arr[track[i][0]][1]))
                {
                    //do nothing
                }
                if(track[i][1]<arr[track[i][0]][0] && (track[i][2]>=arr[track[i][0]][0] && track[i][2]<=arr[track[i][0]][1]))
                {
                    arr[track[i][0]][2]+=arr[track[i][0]][0]-track[i][1];
                }
				if(track[i][1]<arr[track[i][0]][0] && track[i][2]<arr[track[i][0]][1])
				{
					 arr[track[i][0]][2]+=track[i][2]-track[i][1]+1;
				}
				if((track[i][1]>=arr[track[i][0]][0] && track[i][1]<=arr[track[i][0]][1]) && track[i][2]>arr[track[i][0]][1])
				{
					arr[track[i][0]][2]+=track[i][2]-arr[track[i][0]][1];
				}
				if(track[i][1]>arr[track[i][0]][1] && track[i][2]>arr[track[i][0]][1])
				{
					arr[track[i][0]][2]+=track[i][2]-track[i][1]+1;
				}
				if(track[i][1]<arr[track[i][0]][0] && track[i][2]>arr[track[i][0]][1])
				{
					arr[track[i][0]][2]+=arr[track[i][0]][0]-track[i][1];
					arr[track[i][0]][2]=track[i][2]-arr[track[i][0]][1];
				}
            }
        }
        
        long sum=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j][2]==0)
            {
                sum+=m;
            }
            else
                sum+=m-arr[j][2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] track = new int[k][3];
        for(int track_i = 0; track_i < k; track_i++){
            for(int track_j = 0; track_j < 3; track_j++){
                int no= in.nextInt();
                track[track_i][track_j]=no-1;
            }
        }
        long result = gridlandMetro(n, m, k, track);
        System.out.println(result);
        in.close();
    }
}
