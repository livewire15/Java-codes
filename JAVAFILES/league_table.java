import java.util.*;
 class league_table
 {
 public static void main(String args[])
 {
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 String a[]=new String[n];
 int c[]=new int[n];
 int gf[]=new int[n];
 int ga[]=new int[n];
 int gd[]=new int[n];
 Arrays.fill(c,0);
 for(int i=0;i<n;i++)
 {
 a[i]=sc.next();
 }
 String s3="";
 int m=sc.nextInt();
  String b[]=new String[m];

  for(int i=0;i<m;i++)
  {
 while(sc.hasNext())
 {
	 s3+=" "+sc.next();
 }
 b[i]=s3;
 s3="";
  }
  
 int ptr=0,count=0;
 for(int i=0;i<b.length;i++)
 {
	 System.out.println(b[i]);
 String s=b[i];
 System.out.println(s);
 s.trim();
 int pos1=0,pos2=0;
 System.out.println(s.indexOf(' '));
 System.out.println(s.indexOf(' ',s.indexOf(' ')+1));
 String s1=s.substring(0,s.indexOf(' '));
 String s2=s.substring(s.indexOf(' ')+1,s.indexOf(' ',s.indexOf(' ')+1));
 if(s1!=s2)
 {
 int flag1=0,flag2=0;
 for(int j=0;j<a.length;j++)
 {
 if(flag1!=1)
 {
 if(s1==a[j])
 {
 pos1=j;
 flag1=1;
 }
 }
 if(flag2!=1)
 {
 if(s2==a[j])
 {
 pos2=j;
 flag2=1;
 }
 }
 }
 
 int i1=Integer.parseInt(s.substring(s.indexOf(" ",s.indexOf(" ")+1)+1,s.lastIndexOf(" ")));
 int i2=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1,s.length()));
 gf[pos1]+=i1;
 ga[pos2]+=i1;
 gf[pos2]+=i2;
 ga[pos1]+=i2;
 
 if(i1>i2)
 {
 c[pos1]+=2;
 }
 else if(i2>i1)
 c[pos2]+=2;
 else
 {
 c[pos1]+=1;
 c[pos2]+=1;
 }
 }
 else
 {
 ptr=1;
 break;
 }
 }

 String t="",t1="",t2="";
for(int k1=0;k1<a.length;k1++)
{
	for(int k2=0;k2<a.length-1;k2++)
	{
	if(c[k2]<c[k2+1])
	{
		t=a[k2];
		a[k2]=a[k2+1];
		a[k2+1]=t;
	}
	else if(c[k2]==c[k2+1])
	{
		gd[k2]=gf[k2]-ga[k2];
		gd[k2+1]=gf[k2+1]-ga[k2+1];
		if(gd[k2]<gd[k2+1])
		{
		t1=a[k2];
		a[k2]=a[k2+1];
		a[k2+1]=t1;
		}
		else if(gd[k2]==gd[k2+1])
		{
			if(gf[k2]<gf[k2+1])
			{
			t2=a[k2];
		a[k2]=a[k2+1];
		a[k2+1]=t2;	
			}
			else if(gf[k2]==gf[k2+1])
			{
				Arrays.sort(a);
			}
		}
	}
	}
}

if(ptr==0)
{
for(int j=0;j<a.length;j++)
{
	System.out.println(a[j]);
}
}
 else 
 System.out.println("Invalid input");
 }
 }
 