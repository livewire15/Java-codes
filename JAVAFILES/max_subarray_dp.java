import java.util.*;
 class max_subarray_dp
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int t=sc.nextInt();
 while(t>0)
 {
 int n=sc.nextInt();
 int k=sc.nextInt();
ArrayList<Long> al=new ArrayList<Long>(n);
ArrayList<Long> al2=new ArrayList<Long>(n);
int flag=0;
long s=0;
 for(int i=0;i<n;i++)
 {
 long num=sc.nextLong();
 s+=num;
al.add(num);
al2.add(num);
 if(num<0)
	 flag=-1;
 }
 //if(flag==0)	 
	//System.out.println((long)k*subarray(n,al,0,Long.MIN_VALUE));
//else
//{
	if(k>1)
	{
	if(s<=0)
	{
	al.addAll(al2);
	System.out.println(subarray(n,al,0,Long.MIN_VALUE));
	}
	else
	{
	long first=subarray(n,al,0,Long.MIN_VALUE);
	al.addAll(al2);
	long second=subarray(n,al,0,Long.MIN_VALUE);
	al.addAll(al2);
	long third=subarray(n,al,0,Long.MIN_VALUE);
	long incr=third-second;
	second+=incr*(long)(k-2);
	System.out.println(second);
	}
    }
	else
	{
		System.out.println(subarray(n,al,0,Long.MIN_VALUE));
	}
	  t--;
 }
 }
 
 
 static long subarray(int n,ArrayList<Long> al,long sum,long max)
 {
for(int i=0;i<al.size();i++)
 {
	sum+=al.get(i);
	if(sum>max)
		max=sum;
	if(sum<0)
		sum=0;
}
return max;
 }
 }