static int kadane()
{
	int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
	int sum=0,max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
		if(sum>max)
			max=sum;
		if(sum<0)
			sum=0;
	}
	return max;
}