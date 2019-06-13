import java.util.*;
class Alphacode_string_dp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  do
  {
	  String str=sc.next();
int l=str.length();
if(str.charAt(0)=='0')
   System.exit(0);
long arr[]=new long[l+1];
  arr[0]=1;
  arr[1]=1;
System.out.println(alpha(str,l,arr,0));
}while(sc.hasNext());
}
  
  static int alpha(String str,int size,long arr[],int i)
  {
    for(i=2;i<arr.length;i++)
    {
      arr[i]=arr[i-1];
      if(Integer.valueOf(str.substring(i-2,i))<=26)
      {
        arr[i]+=arr[i-2];
      }
    }
    return (int)arr[i-1]%(1000000000+7);
}
}