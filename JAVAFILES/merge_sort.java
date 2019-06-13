class merge_sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int c[]=sort(arr,0,arr.length-1);
for(int j=0;j<c.length;j++)
{
System.out.println(c[j]);
}
}

static int[] sort(int a[],int start,int end)
{
if(start==end)
return a;
else if(start>end)
{
int b[]=new int[0];
return b;
}
else
{
int mid=(start+end)/2;
sort(a,start,mid);
sort(a,mid+1,end);
a=merge(a,start,end);
return a;
}
}

int k=0;

static int[] merge(int a[],int s,int e)
{
int c[]=new int[a.length];
while(s!=e)
{
if(a[s]<=a[e])
{
c[k++]=a[s];
s++;
}
else 
{
c[k++]=a[e];
e--;
}
}
return c;
} 
}