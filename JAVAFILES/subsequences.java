import java.util.*;
class subsequences
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
//String arr[]=new String[(int)Math.pow(2,s.length())];
int ans[]=subseq(s);
for(int i=0;i<ans.length;i++)
{
System.out.println(ans[i]);
}
}

static int[] subseq(String s)
{
if(s.length()==0)
{
int arr[]=new int[0];
arr[0]="";
return arr;
}
else 
{
int ans[]=subseq(s.substring(1));
for(int i=0;i<ans.length;i++)
{
ans[i+ans.length]=s.charAt(0)+ans[i];
}
return ans;
}
}
}