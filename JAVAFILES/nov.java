import java.io.*;
import java.util.*;
import java.lang.Math;
class A
	{
		public static long calc(int i)
			{
				String s2=Integer.toString(i);
				int l=s2.length();
				int p=0;
				long e=0,o=0;
				while(p<l)
					{
						long trp=Character.getNumericValue(s2.charAt(p));
						if(trp%2==0)
							e+=trp;
						else
							o+=trp;
						p++;
					}
				long r=(long)Math.abs(e-o);
				return r;
			}
		public static void main(String args[])throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String s=br.readLine();
				int t=Integer.parseInt(s);
				long an[]=new long[2000000+1];
				long tt[]=new long[2000000+1];
				Arrays.fill(tt,0);
				Arrays.fill(an,0);an[1]=1;an[2]=2;an[3]=3;an[4]=4;an[5]=5;an[6]=6;an[7]=7;an[8]=8;an[9]=9;
				while(t!=0)
					{
						String s1=br.readLine();
						int n=Integer.parseInt(s1);
						tt[1]=2;
						if(tt[n]==0){
						for(int h=2;h<=n;h++){
						if(tt[h]==0){
						long ans=2;
						long j=2;
						int i=3,p=h+h-1;
						while(i<=p)
							{
								if(an[i]==0)
								an[i]=calc(i);
								ans=ans+(j*an[i]);
								if(an[i+1]==0 && i%2==1)
									{an[i+1]=calc(i+1);
									tt[i]=ans+an[i+1];}
								if(i<h+1)
								j++;
								else if(i>=h+1)
								j--;
								i++;
										
							}
						if(n!=1)
							{an[h+h]=calc(h+h);
							ans=ans+an[h+h];}
						tt[h]=ans;}}}
						System.out.println(tt[n]);
						t--;
					}
				}
	}
