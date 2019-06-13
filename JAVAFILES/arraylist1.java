import java.util.*;
class arraylist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
al.add(sc.nextInt());
}

int i=0,flag=0;
while(i<al.size())
{
flag=0;
for(int j=i+1;j<al.size();j++)
{
	//System.out.println("h"+al.get(i)+al.get(j));
if((al.get(i)+al.get(j))%2==0)
{
flag=1;
int x=al.get(i);
int y=al.get(j);
al.remove(i);
al.remove(j-1);
al.add(x+y);
//System.out.println(al);
}
}
if(flag==1)
i=0;
else
i++;
}
System.out.println(al.size());
//System.out.println(al);
t--;
}
}
}
