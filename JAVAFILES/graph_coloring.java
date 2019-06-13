import java.util.*;
class graph_coloring
{
public static void main(String args[])
{
int x[]=new int[7];
int g[][]={{0,0,0,0,0,0,0},{0,0,1,1,0,0,0},{0,1,0,1,1,1,0},{0,1,1,0,0,1,1},{0,0,1,0,0,1,0},{0,0,1,1,1,0,1},{0,0,0,1,0,1,0}};
Arrays.fill(x,0);
gcolor(1,6,4,x,g);
}

static void gcolor(int k,int n,int m,int x[],int g[][])
{
if(k<=n)
{
for(int c=1;c<=m;c++)
{
if(isSafe(k,c,n,x,g))
{
x[k]=c;
gcolor(k+1,n,m,x,g);
return;
//x[k]=0;//backtrack..used when finding all possible solutions
}
}
}
else
{
System.out.println(1);
for(int i=1;i<=n;i++)
{
System.out.print(x[i]+" ");
}
System.out.println();
//return;
}
}

static boolean isSafe(int k,int c,int n,int x[],int g[][])
{
for(int j=1;j<=n;j++)
{
if(g[k][j]==1 && x[j]==c)
return false;
}
return true;
}

}
