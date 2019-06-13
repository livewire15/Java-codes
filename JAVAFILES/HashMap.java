//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class sol{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[]=new String[100000];
        Map<String,Integer> me=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            me.put(name,phone);
        }
        int k=0,j=0;
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(me.containsKey(s))
                {
                a[k++]=(s+"="+ me.get(s));
            }
        else
            a[k++]="Not found";              
        }
        in.close();
        while(a[j]!=null)
            {
            System.out.println(a[j++]);
        }
    } 
}
