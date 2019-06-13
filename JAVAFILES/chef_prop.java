import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class chef_prop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		float a[]=new float[4];
		for(int i=0;i<4;i++)
		{
		a[i]=sc.nextFloat();
		}
		Arrays.sort(a);
		float w=a[0]/a[1];
		float x=a[2]/a[3];
		if(w==x)
		System.out.println("Possible");
		else
		System.out.println("Impossible");
		}
		}