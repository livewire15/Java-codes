import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
		int max=0,t=0,p=0;
		for(int i=0;i<n-1;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		int k=0;
		p=0;
		while(k<m)
		{
		if(topic[i].charAt(k)=='1'  || topic[j].charAt(k)=='1')
		{
		p++;
		}
		k++;
		}
		if(p>max)
		{
		max=p;
		t=0;
		}
		else if(p==max)
		t++;
		}
    }
	System.out.println(max);
	System.out.println(t+1);
}
}