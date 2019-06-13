import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jumping_clouds
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
		int p=0,i=0;
		while(i!=n-1)
      {
	  if((i+2)<n && c[i+2]==0)
	  i=i+2;
	  else if((i+1)<n && c[i+1]==0)
	  i=i+1;
	  p++;
	  } 
	  System.out.println(p);
}
}
