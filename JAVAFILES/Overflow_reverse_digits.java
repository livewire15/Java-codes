public class Solution {
    public int reverse(int A) {
        int n=A;
        int s=0,prev=0;
        while(n!=0)
        {
            int r=n%10;
            s=s*10+r;
            if((s-r)/10 !=prev)
                return 0;
            prev=s;
            n/=10;
        }
            return s;
    }
}
