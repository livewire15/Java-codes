
import java.util.*;
class test40 
{    
static ArrayList<Integer> al=new ArrayList<Integer>();
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printDivisors(x);
        System.out.println("al"+al);
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<al.size();i++)
        {
        set.add(x/al.get(i));
        }
        System.out.println("set"+set);
        int val=al.size();
        long count=0;
        for(int i=0;i<val;i++)
        {
        for(int j=0;j<val;j++)
        {
        if(set.contains(al.get(i)*al.get(j)))
            count++;
        }
        }
        System.out.println(count);
        }

static void printDivisors(int n)
    {
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                   al.add(i);
      
                else 
                    {
                    al.add(i);
                    al.add(n/i);
                    }
            }
        }
    }
}