import java.util.*;

/*
	- You are given a sorted integer array that can contain duplicate entries, i.e., same value might appear more than once.

	- Your task is to create a new sorted array that will not contain any duplicates, i.e., the repeating elements should appear only once.

*/

public class solution 
{
	public static int[] removeDuplicates(int arr[])
	{
		//	write your code here.
      
      HashSet<Integer> set=new HashSet<Integer>();
	  int arr2[]=new int[arr.length];
      
      int k=0,p=0;
      for(int i=0;i<arr.length;i++)
      {
        if(!set.contains(arr[i]))
		{
			set.add(arr[i]);
			arr2[k++]=arr[i];;
      }
	  }
      int arr3[]=new int[k];
      for(int j=0;j<arr2.length;j++)
      {
        if(arr2[j]!=0)
          arr3[p++]=arr2[j];
      }
	  return arr3;
	}
}