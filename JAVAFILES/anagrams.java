import java.util.*;
import java.util.Arrays;
class anagrams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
											//string to char array and vice-versa.
			a=a.toLowerCase();
			b=b.toLowerCase();
            char c[]=a.toCharArray();
			Arrays.sort(c);
			a=new String(c);
        
			char c1[]=b.toCharArray();
			Arrays.sort(c1);
			b=new String(c1);
			if(a.equals(b))
			System.out.println("Anagrams");
			else
			System.out.println("Not Anagrams");
			}
			}