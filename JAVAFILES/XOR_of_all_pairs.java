// An efficient Java program to compute 
// sum of bitwise OR of all pairs
import java.io.*;
 
class GFG {
     
    // Returns sum of bitwise OR
    // of all pairs
    static long sumXOR(int arr[], int n)
    {
        long sum = 0;
        for (int i = 0; i < 32; i++) 
        {
            // Count of zeros and ones
            int zc = 0, oc = 0; 
             
            // Individual sum at each bit position
            long idsum = 0; 
             
            for (int j = 0; j < n; j++)
            {
                if (arr[j] % 2 == 0)
                    zc++;
                     
                else
                    oc++;
                arr[j] /= 2;
            }
             
            // calculating individual bit sum 
            idsum = oc * zc * (1 << i); //Math.pow(2,i);
     
            // final sum 
            sum += idsum; 
        }
        return sum;
    }
     
    // Driver Code
    public static void main(String args[])
    {
        long sum = 0;
        int arr[] = { 5, 9, 7, 6 };
        int n = arr.length;
         
        sum = sumXOR(arr, n);
        System.out.println(sum);
    }
}
 
// This code is contributed by Nikita Tiwari.