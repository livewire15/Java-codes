import java.util.*;
import java.util.HashMap;
import java.util.Map;
 class circles
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		long sq[]=new long[n];
		HashMap<Long,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		sq[i]=(long)((long)arr[i]*(long)arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		long val=(long)(((long)arr[i]*(long)arr[i])+((long)arr[j]*(long)arr[j]));
		if(hm.containsKey(val))
		{
		int p=hm.get(val);
		p=p+1;
		hm.put(val,p);
		}
		else
		{
		hm.put(val,1);
		}
		}
		}
		
		long count=0;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			long val=sq[i]+arr[j];
			if(hm.containsKey(val))
			{
				count+=hm.get(val);
			}
		}
		}
		System.out.println(count);
		t--;
		}
		}
		}
		