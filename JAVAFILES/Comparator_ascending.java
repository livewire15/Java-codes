import java.util.*;
class test44 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<n;i++)
    	{
    		list.add(sc.nextInt());
    	}
      Collections.sort(list,new MyComparator());
      System.out.println(list);
    }
}

class MyComparator implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        return a-b;//for ascending and (b-a) for descending.
    }
}