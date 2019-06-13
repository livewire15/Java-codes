import java.util.*;
class twoPointer
{		
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[]=new int[m];
	for(int i=0;i<m;i++)
	{
	arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int i=n-1,min=1000;
	while(i<m)
	{
	if((arr[i]-arr[i-(n-1)])<min)
		min=arr[i]-arr[i-(n-1)];
	i++;
	}
	System.out.println(min);
	}
}