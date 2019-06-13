import java.util.*;
class longest_bitonic
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 {
 arr[i]=sc.nextInt();
 }
 int ans=longestBitonicSubarray(arr);
 System.out.println(ans);
}
		
	public static int longestBitonicSubarray(int[] arr){

      int output[]=new int[arr.length];
      return longest(arr,output);		
	}
  
  public static int longest(int arr[],int output[])
  {
    output[0]=1;
    int i,j;
    for( i=1;i<arr.length;i++)
    {
		output[i]=1;
      for(j=i-1;j>=0;j--)
      {
        if(arr[j]>=arr[i])
          continue;
        int ans=output[j]+1;
        if(ans>output[i])
          output[i]=ans;
      }
    }
    
    int output1[]=new int[arr.length];
   // output1[arr.length-1]=1;
    //output[arr.length-1]+=1;
    for(i=arr.length-2;i>=0;i--)
    {
      output1[i]=1;
      for(j=i+1;j<arr.length;j++)
      {
        if(arr[j]>=arr[i])
          continue;
        int ans1=output1[j]+1;
        if(ans1>output1[i])
          output1[i]=ans1;
      }
      output[i]+=output1[i];
    }
    
    int max=0;
    for(i=0;i<arr.length;i++)
    {
      
        max=max+output[i];
    }
    return max-1;
  }
	
}
