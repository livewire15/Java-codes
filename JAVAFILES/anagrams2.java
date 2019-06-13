import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class anagrams2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
	{
        String s = in.next();
		if(s.length()%2!=0)
		System.out.println(-1);
		else
		{
		String p=s.substring(0,s.length()/2);
		String p1=s.substring(s.length()/2,s.length());
		int count=0;
		for(int i=0;i<p.length();i++)
		{
			char ch=p.charAt(i);
			int index=p1.indexOf(ch);
			if(index==-1)
			{
				count++;
			}
			else
			{
				p1=p1.substring(0,index)+p1.substring(index+1,p1.length());
			}
		}
			
			System.out.println(count);
    }
	}
}
}
