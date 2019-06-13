public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        
        int n= A.size();
        
        int[] plus= new int[n];
        int[] minus= new int[n];
        int sum =0;
        int pmax= Integer.MIN_VALUE;
        int pmin= Integer.MAX_VALUE;
        int mmax= Integer.MIN_VALUE;
        int mmin= Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
           plus[i]=A.get(i)+i;
           minus[i]=A.get(i)-i;
        }
        for(int i=0;i<n;i++)
        
        {
            if(plus[i]>pmax)
            pmax=plus[i];
            if(plus[i]<pmin)
            pmin=plus[i];
             if(minus[i]>mmax)
            mmax=minus[i];
            if(minus[i]<mmin)
            mmin=minus[i];
        }
        
        if((pmax-pmin)>(mmax-mmin))
        
        return pmax-pmin;
        else
        return mmax-mmin;
    }
}
