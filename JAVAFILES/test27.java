import java.util.*;
class test28
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<String> tri=new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		String ss=sc.nextLine();
		tri.add(ss);
		System.out.println(tri);
	}
	List<String> ans=getType(tri);
	System.out.println(ans);
	}

static List<String> getType(List<String> abc)
{
	List<String> list=new ArrayList<String>();
	for(int i=0;i<abc.size();i++)
	{
		String s=abc.get(i);
		StringTokenizer st=new StringTokenizer(s);
		String arr[]=new String[3];
		int k=0;
		while(st.hasMoreTokens())
		{
			arr[k++]=st.nextToken();
		}
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=Integer.parseInt(arr[2]);
		if((a+b)>c && (b+c)>a && (a+c)>b)
		{
			if(a==b && b==c)
				list.add("Equilateral");
			else if((a==b && b!=c)|| (a==c && a!=b)||(b==c && a!=b))
				list.add("Isosceles");
			else
				list.add("None of these");
		}
		else
			list.add("Not a triangle");
	}
	return list;
}
}