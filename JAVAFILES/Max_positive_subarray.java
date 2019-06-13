import java.util.*;
public class Max_positive_subarray {
    public static void main(String args[])
    {
        int arr[]={24115, -75629, -46517, 30105, 19451, -82188, 99505, 6752, -36716, 54438, -51501, 83871, 11137, -53177, 22294, -21609, -59745, 53635, -98142, 27968, -260, 41594, 16395, 19113, 71006, -97942, 42082, -30767, 85695, -73671};
        int ans[]=maxset(arr);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }

    public static int[] maxset(int[] A) {
        long sum=0;
        ArrayList<Integer> al1=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        long max=(long)Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)s
        {
            if(A[i]>=0)
            {
                sum+=A[i];
                al1.add(A[i]);
            }
            else
            {
                if(sum>max)
                {
                  max=sum;
                  al2=(ArrayList)al1.clone();
                }
                else if(sum==max)
                {
                    if(al2.size()!=al1.size())
                        al2=(al2.size()>al1.size())?al2:al1;
                }
                al1.clear();
                sum=0;
            }
        }
        
        if(sum>max)
                {
                  max=sum;
                  al2=(ArrayList)al1.clone();
                  al1.clear();
                }
                else if(sum==max)
                {
                    if(al2.size()!=al1.size())
                        al2=(al2.size()>al1.size())?al2:al1;
                }
                
        int ans[]=new int[al2.size()];
        for(int j=0;j<al2.size();j++) 
            ans[j]=al2.get(j);
            
        return ans;
    }
}
