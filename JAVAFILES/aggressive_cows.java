import java.util.*;
class aggressive_cows
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--)
{
int n=sc.nextInt();
int c=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(cows(n,c,arr));
}
}

public int cows(int n,int c,int pos[])
{
Arrays.sort(pos);
int ans=0;
int start=0;
int end=pos[n-1]-pos[0];
while(start<=end)
{
int mid=(start+end)/2;
if(possible(n,c,pos,mid))
{
start=mid+1;
ans=mid;
}
else
end=mid-1;
}
return ans;
}

public boolean possible(int n,int c,int pos[],int dist)
{
int last_pos=pos[0];
int count=0;
for(int i=1;i<n;i++)
{
if(pos[i]-last_pos>=dist)
{
last-pos=pos[i];
count++;
}
if(count==cows)
return true;
}
return false;
}

}