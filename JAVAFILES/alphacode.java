import java.util.*;
class alphacode
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=code(n);
System.out.println(ans);
}

static int code(int n)
{
if(n<10)//means if number is of size 1 or 0 then
return 1;
else
{
int output=code(n/10);
output+=1;
if(n>=10)
{
output+=code(n/100);
}
return output;
}
}
}