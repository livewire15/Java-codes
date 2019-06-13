import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_unsorted {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
	BigInteger arr[]=new BigInteger[n];
	   BigInteger bg1;
	   
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
			bg1=new BigInteger(unsorted[unsorted_i]);//creating object of big integer to store string.
			arr[unsorted_i]=bg1;//copying the value of object to biginteger array.
        }
       
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
        
    }
}
