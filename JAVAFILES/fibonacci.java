int fibo(int n)
{
if(n==0 || n==1)
return 1;
if(arr[n]>0)
return arr[n];
else //storing the computed result in array so that values are resued.O(n) time.
{
int output=fibo(n-1)+fibo(n-2);
arr[n]=output;
return output;
}
}