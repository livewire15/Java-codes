import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int l=str.length();
if(str.charAt(0)=='0')
   System.exit(0);
int arr[]=new int[l+1];
System.out.println(alpha(str,l,arr));
}
  
  static int alpha(String str,int size,int arr[])
  {
    if(size==0 || size==1)
      return 1;
    
    if(arr[size]>0)
      return arr[size];
    
    else
    {
      int output=alpha(str,size-1,arr);
      if(size>1)
      {
      int num=Integer.parseInt(str.substring(size-2,size));
      if(num<=26)
      {
        output+=alpha(str,size-2,arr);
      }
      }
      arr[size]=output%(1000000000+7);
      return output%(1000000000+7);
    }
  }
}