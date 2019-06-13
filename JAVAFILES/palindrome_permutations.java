import java.util.*;
class palindrome_permutations
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
String s=sc.next();
int arr[]=new int[27];
for(int i=0;i<s.length();i++)
{
arr[(int)s.charAt(i)-97]++;
}

int count=0;
for(int i=0;i<s.length();i++)
{
if(arr[i]%2==0)
count++;
}

int arr2[]=new int[27];
if(count>=arr.length-1)
{
for(int j=0;j<s.length();j++)
{
if(arr[(int)s.charAt(j)-97]%2==0)
{
if(arr2[(int)s.charAt(j)-97]%2==0)
arr2[(int)s.charAt(j)-97]=start;
else
arr2[(int)s.charAt(j)-97]=s.length()-start+1;
}
else
{

}
}
}
else
System.out.println(-1);
}
}
}
}