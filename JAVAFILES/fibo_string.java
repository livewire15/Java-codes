import java.util.*;
class fibo_string
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
String s=sc.next();
int arr[]=new int[26];
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
arr[(int)ch-97]++;
}
Arrays.sort(arr);
int flag=0,count=0;
for(int i=0;i<arr.length-2;i++)
{
	if(arr[i]!=0)
	{
if((arr[i]+arr[i+1])==arr[i+2])
{
	count++;
continue;
}
else if(count==1)
{
	if(arr[i-1]+arr[i+1]==arr[i+2])
	{
		count++;
		continue;
	}
	else
	{
		flag=-1;
		break;
	}
	
}
else
{
flag=-1;
break;
}
}
}
if(flag==0)
{
System.out.println("Dynamic");
}
else
System.out.println("Not");
t--;
}
}
}