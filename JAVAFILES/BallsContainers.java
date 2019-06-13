import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
    int rowsum[]=new int[container.length];
    int colsum[]=new int[container.length];
    Arrays.fill(rowsum,0);
    Arrays.fill(colsum,0);
        
    for(int i=0;i<container.length;i++)
    {
        for(int j=0;j<container[i].length;j++)
        {
            rowsum[i]+=container[i][j];
            colsum[i]+=container[j][i];
        }
    }
    Arrays.sort(rowsum);
    Arrays.sort(colsum);
        
    int count=0;
    for(int i=0;i<container.length;i++)
    {
        if(rowsum[i]==colsum[i])
            count++;
        else
            break;
    }
        if(count==container.length)
            return "Possible";
        else
            return "Impossible";
        
     /*int type1=rowsum[i]-container[i][i];
     int type2=colsum[i]-container[i][i];
        if(type1==type2)
            count++;
    if(count>=container.length-1)
        return "Possible";
    else
        return "Impossible";  */ 
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
