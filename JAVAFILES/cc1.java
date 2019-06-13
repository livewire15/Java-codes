import java.util.*;
import java.util.HashMap;
class Xor_pair_codechef 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
    	int arr[]=new int[n];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        ArrayList<Integer> ale=new ArrayList<Integer>();
        ArrayList<Integer> alo=new ArrayList<Integer>();
        int freq[]=new int[10000000];

    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}

        long even=0,odd=0,count=0,f1=0,f2=0,total=0;
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
            if(arr[i]%2==0)
            {
                even++; 
                ale.add(arr[i]);     
            }
            else
            {
                odd++;
                alo.add(arr[i]);
            }
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }

        even=(even-1)*even/2;
        odd=(odd-1)*odd/2;
        int ptr1=0,ptr2=0;
        for(int i=0;i<ale.size();i++)
        {
            int val=ale.get(i);
            if(freq[(int)(val^2)]>0)
            {
                ptr1+=freq[(int)(val^2)];
            }
            freq[val]--;
        }
        for(int i=0;i<alo.size();i++)
        {
            int val=alo.get(i);
            if(freq[(int)(val^2)]>0)
            {
                ptr2+=freq[(int)(val^2)];
            }    
            freq[val]--;
        }
        even-=ptr1;
        odd-=ptr2;
        total=even+odd;
        //System.out.println(hm);
        for (Map.Entry m:hm.entrySet())
        {
            if((int)m.getValue()>1)
            {
                long val=(int)m.getValue();
                //System.out.println((int)m.getKey()+" "+val);
                total=total-(val-1)*val/2;
            }
        }
        System.out.println(total);
    }
}
}