import java.util.*;

public class Game
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int game[]=new int[n];
int bill[]=new int[m];
for(int i=0;i<n;i++)
{
game[i]=sc.nextInt();
}
for(int i=0;i<m;i++)
{
bill[i]=sc.nextInt();
}

int i=0,j=0,count=0;
while(i<m && j<n)
{
if(bill[i]>=game[j])
{
j++;
i++;
count++;
}
else
{
j++;
}
}
System.out.println(count);
}
}