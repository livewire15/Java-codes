import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class handshake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
			int sum=0;
			N=N-1;
			while(N>0)
			{
			sum+=N;
			N--;
			}
			System.out.println(sum);
        }
    }
}
