import java.util.*;
import java.util.HashMap;
class Partition 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int n=sc.nextInt();
        long arr[]=new long[n];
        long sum[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }

        sum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            sum[i]=sum[i-1]+arr[i];
        }
        HashMap<Long,Integer> map=new HashMap<Long,Integer>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        int position[]=new int[n];
        position[0]=map.get(arr[0]);//get index and stored in position array.
        for(int i=1;i<n;i++)
        {
            position[i]=Math.max(position[i-1],map.get(arr[i]));//If index of previous element is greater then all the elements till that
            //index cannot be partitioned.
        }

        long min=10000000000000L;
        float point=-1;
        for(int i=0;i<n-1;i++)
        {
            if(position[i]==i)//means no further occurence of this element is present, then we can partition here.
            {
                long diff=Math.abs(sum[n-1]-sum[i]-sum[i]);
                if(diff<min)
                {
                    min=diff;
                    point=(float)(i+i+3)/2;
                }
            }
        }
        if(point==(int)point)
            System.out.println((int)point);
        else
            System.out.println(point);
    }
}
}