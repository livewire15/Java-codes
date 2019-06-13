import java.util.*;
class magical_string
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();

char arr[]=a.toCharArray();
char arr2[]=b.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr2);
int n1=arr.length;
int n2=arr2.length;
int i=0,j=0,count=0;
while(i<n1 && j<n2)
{
if(arr[i]==arr2[j])
{
i++;
j++;
count++;
}
else if((Integer.valueOf(arr[i]))>Integer.valueOf(arr2[j]))
j++;
else
i++;
}
System.out.println(count);
}
}
