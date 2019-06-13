import java.util.*;
import java.util.Arrays;
class anagram_instacode
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {//string to char array and vice-versa.
            a[i]=sc.next();
            char c[]=a[i].toCharArray();
			Arrays.sort(c);
			a[i]=new String(c);
        }
		int max=0,p=1;
        for(int j=0;j<n;j++)
        { 
		if(a[j]!="*")
		{
		    p=1;
            for(int k=j+1;k<n;k++)
            {  
               if(a[j].equals(a[k]))
			   {
			   p++;
			   a[k]="*";
        }
		}
		if(p>max)
		max=p;       
    }
	}
	System.out.println(max);
}
}