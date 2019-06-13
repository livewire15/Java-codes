//In this solution precision problem is occuring, on taking float 1024000000 is working but in double it is not working
//and some are not working in double.So better solution is in power_xy_correct.java file.

import java.util.*;
public class power_xy {

    public static void main(String args[])
    {
    System.out.println(isPower(536870912));
    }

    public static int isPower(int A) 
    {
        if(A==1)
            return 1;
        
        for (int x = 2; x <= Math.sqrt(A); x++) 
        {
            int p = x;
            double val=(double)Math.log(A)/(double)Math.log(x);
            System.out.println(x+" "+val);
            if((int)val==val)
            {
                System.out.println(x+" "+val);
                return 1;
            }
        }
        return 0;
    }
}
