import java.util.*;
class snakesLadders
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int board[]=new int[101];
Arrays.fill(board,0);
while(t>0)
{
int n=sc.nextInt();
while(n>0)
{
int a=sc.nextInt();
int b=sc.nextInt();
board[a]=b;
n--;
}
int m=sc.nextInt();
while(m>0)
{
int a1=sc.nextInt();
int b1=sc.nextInt();
board[a1]=b1;
m--;
}
int min[]={Integer.MAX_VALUE};
snakes(board,1,0,min);
System.out.println(min[0]);
t--;
}
}

static void snakes(int board[],int source,int count,int min[])
{
for(int i=source;i<=100;i++)
{
	if(count>min[0])
		return;
	if(board[i]!=0)
	{
		//System.out.println("board "+board[i]);
		count+=(int)Math.ceil((float)(i-source)/(float)6);
		//System.out.println(i+" "+source+" "+count);
		snakes(board,board[i],count,min);
	}
}
count+=(int)Math.ceil((float)(100-source)/(float)6);
if(count<min[0])
{
	min[0]=count;
	//System.out.println("h"+count);
}
}
}