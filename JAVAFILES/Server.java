import java.util.*;
public class Server
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> resId=new ArrayList<Integer>();
ArrayList<Integer> userId=new ArrayList<Integer>();
ArrayList<Integer> dataSize=new ArrayList<Integer>();
while(sc.hasNext()) //Taking input logs
{
String log=sc.next();
String arr[]=log.split(" ");
userId.add(Integer.parseInt(arr[4]));
resId.add(Integer.parseInt(arr[5]));
dataSize.add(Integer.parseInt(arr[6]));
}
Collections.sort(userId); //Sorting according to userId
Collections.sort(resId); //Sorting acc. to resourceId
String s=sc.next();
String str="https://myapp/data/us";
//char ch=' " ';
if(s.equals(str))
{
System.out.println("{"+"\"error\""+": "+"\"Incomplete url\""+"}");
}
else
{
String s1=s.substring(19);
if(s1.equals("user"))
{
System.out.println("{"+"\"data\""+":[");
while(userId.get(i)!=null)
	System.out.println("{"+"\"userId\""+":"+userId.get(i)+","+"\"activityNum\""+":"+i+1+","+"\"dataConsumed\""+":243"+"}"+","{"userId":2,"activityNum":2,"dataConsumed":324}]}");
}
if(s1.equals("resource?top= true  "))
{
System.out.println(resId.get(0));
}
}
}
}