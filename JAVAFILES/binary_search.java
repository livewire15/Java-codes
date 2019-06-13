public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		int x=search(input,element,0,input.length-1);
      return x;
	}
  
  static int search(int arr[],int x,int low,int high)
  {
    int mid=(low+high)/2;
    if(low>high)
      return -1;
    if(arr[mid]==x)
      return mid;
    else if(arr[mid]<x)
      return search(arr,x,mid+1,high);
    else
      return search(arr,x,low,mid-1);
  }
}
