import java.util.*;
 class heapsort
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
		 	arr[i]=sc.nextInt();
		 }
		 n=n-1;
		 sort(arr,n);
		 for(int j=0;j<=n;j++)
			 System.out.print(arr[j]+" ");
	 }
	 
	 public static void sort(int arr[],int n)
	 {
		 build_maxheap(arr,n);//Builds heap structure
		 for(int i=n;i>0;i--)
		 {
			 swap(arr,0,i);
			 n=n-1;
			 maxheapify(arr,0,n);
		 }
	 }
 
 //Builds heap structure
 public static void build_maxheap(int arr[],int n)
 {
	 for(int i=n/2;i>=0;i--)
	 {
	 	maxheapify(arr,i,n);
	 }
 }
 
 //Makes comparisons with every element
 public static void maxheapify(int arr[],int i,int n)
 {
	 int left=2*i;
	 int right=2*i+1;
	 int max=i;
	 if(left<=n && arr[left]>=arr[max])
	 	max=left;
	 if(right<=n && arr[right]>=arr[max])
	 	max=right;
	 if(max!=i)
	 {
		 swap(arr,i,max);
		 maxheapify(arr,max,n);
	 }
 }
 
 //swaps parent element with child element
 public static void swap(int arr[],int i,int j)
 {
	 int temp;
	 temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
 }
 }
