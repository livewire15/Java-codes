import java.util.*;
class longest_incr_subseq
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int ans[]=new int[n];
int i=0;
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

ans[0]=1;
for(i=1;i<n;i++)
{
ans[i]=1;
for(int j=i-1;j>=0;j--)
{
if(arr[j]>=arr[i])
continue;
else
{
int possibleans=ans[j]+1;
if(possibleans>ans[i])
	ans[i]=possibleans;
}
}
}

Arrays.sort(ans);
System.out.println(ans[n-1]);
}
}


