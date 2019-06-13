import java.util.*;
class practice
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
do
{
String str=sc.next();
  if((str.charAt(0))=='0')
    System.exit(0);
  else
  {
    System.out.println(fun(str,str.length()));
  }
}while(true);
}
  
  static int fun(String str,int len)
  {
    int arr[]=new int[len+1];
    arr[0]=1;
    arr[1]=1;
    for(int i=2;i<=len;i++)
    {
      arr[i]=arr[i-1]%(1000000000+7);
	  String val1=Character.toString(str.charAt(i-2));
	  String val2=Character.toString(str.charAt(i-1));
	  String val=val1+val2;
      if(Integer.parseInt(val)<=26)
      {
		 // System.out.println("hey"+Integer.valueOf(str.charAt(i-2)+str.charAt(i-1)));
        arr[i]+=arr[i-2]%(1000000000+7);
      }
    }
    return arr[len]%(1000000000+7);
  }
}