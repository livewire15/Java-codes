import java.util.*;
public class power_x^y {

    public static void main(String args[])
    {
    System.out.println(isPower(48));
    }
    public static int isPower(int A) {
        
        float val1=Math.log(A)/Math.log(2);
        for (int x = 2; x <= Math.sqrt(A); x++) {
            int p = x;
            float val=val1*(float)(Math.log(2)/Math.log(x));
            if((int)val==val)
                return 1;
        }
        return 0;
    }
}
