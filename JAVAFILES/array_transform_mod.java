#include<bits/stdc++.h>
using namespace std;
int main()
{
	int ans[1000];
	int t;
	cin>>t;
	while(t--)
	{
		memset(ans,0,sizeof(ans));
		int n,k;
		cin>>n>>k;
		int a[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		for(int i=0;i<n;i++)
		{
			ans[a[i]%(k+1)]++;
			if(ans[a[i]%(k+1)]==n-1)
			{
			cout<<"YES"<<endl;
			flag=1;
			break;
			}
		}
		if(flag==0)
		cout<<"NO"<<endl;
	}
} 



