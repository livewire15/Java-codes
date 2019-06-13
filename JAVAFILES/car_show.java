import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class car_show {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            // Write Your Code Here
			l=l-1;
			r=r-1;
			long ap[]=new long[1];
			ap[0]=0;
			ArrayList<Integer> al=fun(l,r,l,A,ap);
			System.out.println(ap[0]);
        }
        in.close();
    }
	
	public static ArrayList<Integer> fun(int l,int r,int i,int arr[],long ap[])
	{
	if(i==r+1)
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	return al;
	}
	else
	{
	ArrayList<Integer> ans=fun(l,r,i+1,arr,ap);
	if(!ans.contains(arr[i]))
	{
	ans.add(arr[i]);	
	ap[0]+=ans.size();
	}
	else
	{
		ans.subList(0,ans.indexOf(arr[i])+1).clear();
		ans.add(arr[i]);
		ap[0]+=ans.size();
	}
	return ans;
	}
	}
}
