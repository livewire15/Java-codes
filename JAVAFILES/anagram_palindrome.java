import java.util.*;
import java.util.Arrays;
class anagram_palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flag=0;
		for(char ch='a';ch<='z';ch++)
		{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if(ch==s.charAt(i))
		count++;
		}
		if(count%2!=0)
		flag++;
		}
		if(flag==0 || flag==1)
		System.out.println("YES");
		else
		System.out.println("NO");
		}
		}