import java.util.*;
class string_keypad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String text[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
String ans[]=keypad(n,text);
for(int i=0;i<ans.length;i++)
{
System.out.println(ans[i]);
}
}

static String[] keypad(int n,String text[])
{
if(n==0)
{
String arr[]=new String[1];
arr[0]="";
return arr;
}
else
{
String ans[]=keypad(n/10,text);
int number=n%10-2;
String output[]=new String[ans.length*text[number].length()];
int k=0,i=0,p=0;
while(k<text[number].length())
{
	p=0;
for(;i<ans.length*(k+1);i++)
{
output[i]=ans[p++]+text[number].charAt(k);
}
k++;
}
return output;
}
}
}