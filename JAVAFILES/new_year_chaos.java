import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class new_year_chaos {

    static void minimumBribes(int[] q) {
        // Complete this function
		int count=0,p=0,flag=0,temp;
		for(int i=0;i<q.length;i++)
		{
		if(count!=q.length-1)
		{
		count=0;
		for(int j=0;j<q.length-1;j++)
		{
		if(q[j]<=j+3 && q[j+1]<=j+1+3)
		{
		if(q[j]>q[j+1])
		{
		temp=q[j];
		q[j]=q[j+1];
		q[j+1]=temp;
		p++;
		}
		else
		count++;
		}
		else
		{
		flag=1;
		break;
		}
		}
		if(flag==1)
		break;
		}
		else
		break;
    }
	if(flag==1)
	System.out.println("Too chaotic");
	else
	System.out.println(p);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] q = new int[n];
            for(int q_i = 0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            minimumBribes(q);
        }
        in.close();
    }
}
