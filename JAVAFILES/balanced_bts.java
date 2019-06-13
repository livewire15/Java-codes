import java.util.*;
import java.math.*;

public class balanced_bts {

public static void main(String args[])
{
int ans=balancedTreesOfHeightH(10);	
System.out.println(ans);
}
	public static int balancedTreesOfHeightH(int height){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

      if(height<=1)
        return 1;
      else
       {
        int x=balancedTreesOfHeightH(height-1);//since height has to be (h-1) on either side coz it is one less than the root.
        int y=balancedTreesOfHeightH(height-2);//height cannot be less than (h-2) coz one side it has to be (h-1)...for (h-3),(h-4)..tree wont be balanced
        int m=(int)Math.pow(10,9)+7;
		int f1=(int)(((long)x*x)%m);
		int f2=(int)(((long)2*x*y)%m);
		int ans=(int)(((long)(f1+f2))%m);
        return ans;
      }
	}
}