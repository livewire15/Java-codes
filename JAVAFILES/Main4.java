import java.util.*;
class Main4 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int k=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
        int i=0;
        String str="";
        while(k>0 && i<arr.length)
        {
            if(k>=arr[i])
            {
                k=k-arr[i];
                str=str+'1';
            }
            else
            {
                str=str+'0';
            }
            i++;
        }
        while(i<arr.length)
        {
            str=str+'0';
            i++;
        }
        System.out.println(str);
    }
}
}