import java.util.*;
class test33
{
	 public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int prefix[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
        prefix[i]=prefix[i-1]+arr[i];
        }
        int flag=0;
        for(int i=n-1;i>=2;i--)
        {
        if(prefix[i-1]>arr[i])
        {
        flag=1;
        System.out.print(i+1);
        break;
        }
        }
        if(flag==0)
        	System.out.print(0);
}
}