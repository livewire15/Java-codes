import java.util.*;
class triplets 
{   
    static int fun(long arr[])
    {       
        // If number of elements are 
        // less than 3, then not possible
        if (arr.length < 3)
            return 0;
			
        // first sort the array
        Arrays.sort(arr);
     
        // loop for all 3 
        // consecutive triplets
		int count=0;
        for (int i = 0; i < arr.length - 2; i++)
		{
            // If triplet satisfies 
            // increase count
            if ((arr[i] + arr[i+1] > arr[i+2]) && (arr[i]!=arr[i+1] && arr[i]!=arr[i+2] && arr[i+1]!=arr[i+2]))
                count++;
         }
        return count;
    }
     
     public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	long al[]=new long[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		al[i]=Long.parseLong(arr[i]);
	}
    System.out.println(fun(al));
	}
}
