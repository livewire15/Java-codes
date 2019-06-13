import java.io.*;
import java.util.*;

public class www {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>(); 
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
            int count=0;
            Collections.sort(al);
            for(int i=al.size()-1;i>=0;)
            {
               int r=al.get(i);
                if(r%2!=0)
                {
                   i--;
                }
                else
                {    
                    if(r==2 || r==1)
                        break;
                     count++;
                    int ele=r/2;
                    al.remove(i);
                    al.add(2);
                    al.add(ele);
                    Collections.sort(al);
					i=al.size()-1;
                }
            }
			
            if(count%2==0)
                System.out.println("Friend");
            else 
                System.out.println("Ram");
            t--;
        }
    }
}