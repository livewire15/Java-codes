import java.util.*;
class triangle
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
a=sc.nextInt();
float h=(float)(2*a)/b;
System.out.println((int)Math.ceil(h));
}
}