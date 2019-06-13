import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class twin_arrays {

    static int twinArrays(int[] ar1, int[] ar2){
        // Complete this function
		int s1=0,s2=0,a1,a2,p1,p2;
        s1=getMinValue(ar1);
		s2=getMinValue(ar2);
		int i1=ArrayUtils.indexOf(ar1,s1);
		int i2=ArrayUtils.indexOf(ar2,s2);
		if(i1!=i2)
			return s1+s2;
		else
		{
			ar1[i1]=100000;
			ar2[i2]=100000;
			a1=getMinValue(ar1);
			p1=a1+s2;
			a2=getMinValue(ar2);
			p2=s1+a2;
			if(p1<p2)
				return p1;
			else
				return p2;
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar1 = new int[n];
        for(int ar1_i = 0; ar1_i < n; ar1_i++){
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];
        for(int ar2_i = 0; ar2_i < n; ar2_i++){
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2);
        System.out.println(result);
    }
}
