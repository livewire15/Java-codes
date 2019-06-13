import java.io.*;
import java.util.*;
class test7
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str1=br.readLine();
int k=(int)Character.getNumericValue(str1.charAt(0));
int arr[][]=new int[k][];
int j=0,n=0;
for(int i=0;i<k;i++)
{
	String str=br.readLine();
	n=Character.getNumericValue(str.charAt(0));
	arr[i]=new int[n];
	arr[i] = Arrays.stream(str.substring(2, str.length()).split(" ")) .map(String::trim).mapToInt(Integer::parseInt).toArray(); 
}

String str3=br.readLine();
int m=Character.getNumericValue(str3.charAt(0));
for(j=0;j<m;j++)
{
String str2=br.readLine();
int i1=Character.getNumericValue(str2.charAt(0));
int j1=Character.getNumericValue(str2.charAt(2));
i1--;
j1--;
long sum=0;
for(int a1=0;a1<arr[i1].length;a1++)
{
for(int a2=0;a2<arr[j1].length;a2++)
{
sum+=Math.abs(arr[i1][a1]-arr[j1][a2]);
}
}
System.out.println(sum);
}
}
}