public static int merge_sort(int a[],int left,int right)
{
int count=0;
if(left<right)
{
int mid=(left+right)/2;
int leftcount=merge_sort(a,left,mid);
int rightcount=merge_sort(a,mid+1,right);
int tcount=merge(a,left,mid,right);
return leftcount+rightcount+tcount;
}
return count;
}

public static merge(int a[],int left,int mid,int right)
{
int i=left;
int j=mid+1;
int k=0;
int count=0;
int temp[]=new int[right-left+1];
while(i<=mid && j<=right)
{
if(a[i]<=a[j])
{
temp[k++]=a[i++];
}
else
{
temp[k++]=a[j++];
count+=mid-i+1;
}
}

while(i<=mid)
temp[k++]=a[i++];

while(j<=right)
temp[k++]=a[j++];

for(int p=left,k=0;p<=right;p++,k++)
	a[p]=temp[k];

return count;
}