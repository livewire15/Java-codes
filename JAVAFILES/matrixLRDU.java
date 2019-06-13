import java.util.*;
class matrixLRDU
{	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		char arr[][]=new char[n][m];
		int row[]=new int[n];
		int col[]=new int[m];
		for(int j=0;j<n;j++)
		{
		int count=0;
		String s=sc.next();
		for(int i=0;i<m;i++)
		{
		arr[j][i]=s.charAt(i);
		if(s.charAt(i)=='1')
			count++;
		}
		row[j]=count;
		}
		
		for(int j=0;j<m;j++)
		{
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(arr[i][j]=='1')
			count++;
		}
		col[j]=count;
		}
		
		String force=sc.next();
		for(int i1=0;i1<force.length();i1++)
		{
		char ch=force.charAt(i1);
		int k=0;
		if(ch=='L')
		{
		for(int j=0;j<row.length;j++)
		{
		for(k=0;k<row[j];k++)
		{
		arr[j][k]='1';
		}
		int pos=0;
		while(pos<(m-row[j]))
		{
		arr[j][k++]='0';
		pos++;
		}
		}
		//row count
		for(int j=0;j<n;j++)
		{
		int count=0;
		for(int i=0;i<m;i++)
		{
		if(arr[j][i]=='1')
			count++;
		}
		row[j]=count;
		}
		//column count
		for(int j=0;j<m;j++)
		{
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(arr[i][j]=='1')
			count++;
		}
		col[j]=count;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		}
		else if(ch=='R')
		{
		for(int j=0;j<row.length;j++)
		{
		for(k=0;k<(m-row[j]);k++)
		{
		arr[j][k]='0';
		}
		int pos=0;
		while(pos<row[j])
		{
		arr[j][k++]='1';
		pos++;
		}
		}
		//row count
		for(int j=0;j<n;j++)
		{
		int count=0;
		for(int i=0;i<m;i++)
		{
		if(arr[j][i]=='1')
			count++;
		}
		row[j]=count;
		}
		//column count
		for(int j=0;j<m;j++)
		{
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(arr[i][j]=='1')
			count++;
		}
		col[j]=count;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		}
		else if(ch=='U')
		{
		for(int j=0;j<n;j++)
		{
		for(k=0;k<col.length;k++)
		{
		if(col[k]>0)
		{
			arr[j][k]='1';
			col[k]=col[k]-1;
		}
		else
		{
			arr[j][k]='0';
		}
		}
		}
		//row count
		for(int j=0;j<n;j++)
		{
		int count=0;
		for(int i=0;i<m;i++)
		{
		if(arr[j][i]=='1')
			count++;
		}
		row[j]=count;
		}
		//column count
		for(int j=0;j<m;j++)
		{
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(arr[i][j]=='1')
			count++;
		}
		col[j]=count;
		}
for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		}
		else
		{
		for(int j=0;j<n;j++)
		{
		for(k=0;k<col.length;k++)
		{
		if((n-col[k])>0)
		{
			arr[j][k]='0';
			col[k]=col[k]+1;
		}
		else
		{
			arr[j][k]='1';
		}
		}
		}
		//row count
		for(int j=0;j<n;j++)
		{
		int count=0;
		for(int i=0;i<m;i++)
		{
		if(arr[j][i]=='1')
			count++;
		}
		row[j]=count;
		}
		//column count
		for(int j=0;j<m;j++)
		{
		int count=0;
		for(int i=0;i<n;i++)
		{
		if(arr[i][j]=='1')
			count++;
		}
		col[j]=count;
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		}
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		t--;
		}
		}
		}
		
		
		