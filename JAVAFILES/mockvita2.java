import java.io.*;
import java.util.*;
class mockvita2
	{
		public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				String s1[]=sc.next().split(",");
				int n=Integer.parseInt(s1[0]);
				int p=Integer.parseInt(s1[1]);
				int q=Integer.parseInt(s1[2]);
				String s2[]=sc.next().split(",");
				int a[]=new int[n];
				for(int i=0;i<n;i++)
					a[i]=Integer.parseInt(s2[i]);
				int mod=1009;
				int dp[]=new int[n];
				for(int i=0;i<n;i++)
					{
						if(a[i]%p==0 && a[i]%q==0)
							dp[i]=p*q;
						else if(a[i]%p==0)
							dp[i]=p;
						else if(a[i]%q==0)
							dp[i]=q;
						else 
							dp[i]=-1;
					}
				int st[]=new int[n];
				st[0]=0;
				for(int i=1;i<n;i++)
					{
						st[i]=(int)Math.pow(2,n-i)%mod-1;
					}
				long ans=0;
				
				for(int i=0;i<n;i++)
					{
						int ch=0;
						if(dp[i]==-1)
							continue;
						if(dp[i]==p*q)
							{ch=1;ans=(ans%mod+1%mod)%mod;}
						else if(dp[i]==p)
							ch=2;
						else
							ch=3;
						for(int j=i+1;j<n;j++)
							{
								if(ch==1)
									{
										ans=(ans%mod+st[j]%mod)%mod;
										break;
									}
								if(ch==2 && dp[j]==q)
									{
										ans=(ans%mod+1%mod)%mod;
										if(j!=n-1)
											ans=(ans%mod+st[j+1]%mod)%mod;
										break;
									}
								if(ch==3 && dp[j]==p)
									{
										ans=(ans%mod+1%mod)%mod;
										if(j!=n-1)
											ans=(ans%mod+st[j+1]%mod)%mod;
										break;
									}
							}
						
					}
				if(n==1 && dp[0]==p*q)
					ans=1;	
				System.out.println(ans%mod);		
			}
	}
	