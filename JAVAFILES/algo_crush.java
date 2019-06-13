import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class algo_crush {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		long arr[]=new long[n];
		Arrays.fill(arr,0);
        int m = in.nextInt();
		long max=0;
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
			for(int i=a-1;i<=b-1;i++)
			{
			arr[i]+=k;
			if(arr[i]>max)
				max=arr[i];
			}
        }
        //Arrays.sort(arr);
		System.out.println(max);
    }
}
