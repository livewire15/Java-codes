
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return index(input,x,0);
	}
  static int[] index(int arr[],int y,int start)
  {
    if(start==arr.length)
	{
		int output[]=new int[0];
		return output;
	}
    else
    {
		int smalloutput[]=index(arr,y,start+1);
		if(arr[start]==y)
		{
			int arr2[]=new int[smalloutput.length+1];
			arr2[0]=start;
			for(int i=0;i<smalloutput.length;i++)
			{
				arr2[i+1]=smalloutput[i];
			}
			return arr2;
		}
		else
		{
			return smalloutput;
		}
	}
  }
}
		
 