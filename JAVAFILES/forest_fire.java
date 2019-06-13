import java.util.*;
class forest_fire
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int i=0,j=0;
char arr[][]=new char[m][n];
int dup[][]=new int[m][n];
for(int i1=0;i1<m;i1++)
{
	Arrays.fill(dup[i1],0);
}
//Arrays.fill(dup,0);
int t1=sc.nextInt();
int t2=sc.nextInt();
t1--;
t2--;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=sc.next().charAt(0);
}
}
int time=0;

for(i=t1-1;i>=0;i--)
{
for(j=t2;j>=0;j--)
{
int flag=0;     
if(arr[i][j]!='W' && dup[i][j]!=-1)
{
	time++;
	dup[i][j]=-1;
if(j>0 && arr[i][j-1]!='W' && dup[i][j-1]!=-1)
	dup[i][j-1]=-1;flag=1;//left
if(i>0 && arr[i-1][j]!='W' && dup[i-1][j]!=-1)
	dup[i-1][j]=-1;flag=1;//up
if(i<m-1 && arr[i+1][j]!='W' && dup[i+1][j]!=-1)
	dup[i+1][j]=-1;flag=1;//down
if(j<n-1 && arr[i][j+1]!='W' && dup[i][j+1]!=-1)
	dup[i][j+1]=-1;flag=1;//right
if(i>0 && j>0 && arr[i-1][j-1]!='W' && dup[i-1][j-1]!=-1)
	dup[i-1][j-1]=-1;flag=1;//left upper diagonal
if(i<m-1 && j>0 && arr[i+1][j-1]!='W' && dup[i+1][j-1]!=-1)
	dup[i+1][j-1]=-1;flag=1;//left down diagonal
if(i>0 && j<n-1 && arr[i-1][j+1]!='W' && dup[i-1][j+1]!=-1)
	dup[i-1][j+1]=-1;flag=1;//right upper diagonal
if(i<m-1 && j<n-1 && arr[i+1][j+1]!='W' && dup[i+1][j+1]!=-1)
	dup[i+1][j+1]=-1;flag=1;//right down diagonal
	
	if(flag==1)
	time++;
}
}
}
System.out.println("h"+time);

for(i=t1;i>=0;i--)
{
for(j=t2+1;j<n;j++)
{
int flag=0;
if(arr[i][j]!='W' && dup[i][j]!=-1)
{
	time++;
	dup[i][j]=-1;
if(j>0 && arr[i][j-1]!='W' && dup[i][j-1]!=-1)
	dup[i][j-1]=-1;flag=1;//left
if(i>0 && arr[i-1][j]!='W' && dup[i-1][j]!=-1)
	dup[i-1][j]=-1;flag=1;//up
if(i<m-1 && arr[i+1][j]!='W' && dup[i+1][j]!=-1)
	dup[i+1][j]=-1;flag=1;//down
if(j<n-1 && arr[i][j+1]!='W' && dup[i][j+1]!=-1)
	dup[i][j+1]=-1;flag=1;//right
if(i>0 && j>0 && arr[i-1][j-1]!='W' && dup[i-1][j-1]!=-1)
	dup[i-1][j-1]=-1;flag=1;//left upper diagonal
if(i<m-1 && j>0 && arr[i+1][j-1]!='W' && dup[i+1][j-1]!=-1)
	dup[i+1][j-1]=-1;flag=1;//left down diagonal
if(i>0 && j<n-1 && arr[i-1][j+1]!='W' && dup[i-1][j+1]!=-1)
	dup[i-1][j+1]=-1;flag=1;//right upper diagonal
if(i<m-1 && j<n-1 && arr[i+1][j+1]!='W' && dup[i+1][j+1]!=-1)
	dup[i+1][j+1]=-1;flag=1;//right down diagonal
	
	if(flag==1)
	time++;
}
}
}

for(i=t1;i<m;i++)
{
for(j=t2;j>=0;j--)
{
int flag=0;
if(arr[i][j]!='W')
{
	if(dup[i][j]!=-1)
{
	time++;
	dup[i][j]=-1;
	}
if(j>0 && arr[i][j-1]!='W' && dup[i][j-1]!=-1)
{
	
	dup[i][j-1]=-1;flag=1;//left
}
if(i>0 && arr[i-1][j]!='W' && dup[i-1][j]!=-1)
{
	dup[i-1][j]=-1;flag=1;//up
}
if(i<m-1 && arr[i+1][j]!='W' && dup[i+1][j]!=-1)
{
	dup[i+1][j]=-1;flag=1;//down
}
if(j<n-1 && arr[i][j+1]!='W' && dup[i][j+1]!=-1)
{
	dup[i][j+1]=-1;flag=1;//right
}
if(i>0 && j>0 && arr[i-1][j-1]!='W' && dup[i-1][j-1]!=-1)
{
	dup[i-1][j-1]=-1;flag=1;//left upper diagonal
}
if(i<m-1 && j>0 && arr[i+1][j-1]!='W' && dup[i+1][j-1]!=-1)
{
	dup[i+1][j-1]=-1;flag=1;//left down diagonal
}
if(i>0 && j<n-1 && arr[i-1][j+1]!='W' && dup[i-1][j+1]!=-1)
{
	dup[i-1][j+1]=-1;flag=1;//right upper diagonal
}
if(i<m-1 && j<n-1 && arr[i+1][j+1]!='W' && dup[i+1][j+1]!=-1)
{
	dup[i+1][j+1]=-1;flag=1;//right down diagonal
}

	if(flag==1)
	time++;
}
}
}

for(i=t1+1;i<m;i++)
{
for(j=t2+1;j<n;j++)
{
int flag=0;
if(arr[i][j]!='W' && dup[i][j]!=-1)
{
	time++;
	dup[i][j]=-1;
if(j>0 && arr[i][j-1]!='W' && dup[i][j-1]!=-1)
	dup[i][j-1]=-1;flag=1;//left
if(i>0 && arr[i-1][j]!='W' && dup[i-1][j]!=-1)
	dup[i-1][j]=-1;flag=1;//up
if(i<m-1 && arr[i+1][j]!='W' && dup[i+1][j]!=-1)
	dup[i+1][j]=-1;flag=1;//down
if(j<n-1 && arr[i][j+1]!='W' && dup[i][j+1]!=-1)
	dup[i][j+1]=-1;flag=1;//right
if(i>0 && j>0 && arr[i-1][j-1]!='W' && dup[i-1][j-1]!=-1)
	dup[i-1][j-1]=-1;flag=1;//left upper diagonal
if(i<m-1 && j>0 && arr[i+1][j-1]!='W' && dup[i+1][j-1]!=-1)
	dup[i+1][j-1]=-1;flag=1;//left down diagonal
if(i>0 && j<n-1 && arr[i-1][j+1]!='W' && dup[i-1][j+1]!=-1)
	dup[i-1][j+1]=-1;flag=1;//right upper diagonal
if(i<m-1 && j<n-1 && arr[i+1][j+1]!='W' && dup[i+1][j+1]!=-1)
	dup[i+1][j+1]=-1;flag=1;//right down diagonal
	
	if(flag==1)
	time++;
}
}
}
System.out.println(time);  

}
}