import java.util.*;
class test41 {
    
 public static void main(String[] args)
    { 
    Scanner p=new Scanner(System.in);
    int n=p.nextInt();
       long sum=0,ans=0;
       long arr[]=new long[10];
       for(int i=0;i<10;i++)
       {
        arr[i]=(long)Math.pow(2,i);
       }

     while(n-->0)
     {
        long power=p.nextLong();
        int r=(int)power%10;
        power/=10;
        if(power%2==0)
            ans=arr[r];
        else
        {
            ans=(long)24*arr[r];
        }
        sum=(sum+ans%100)%100;
    }
    System.out.println(sum%100);
}
}
