import java.util.*;
import java.util.Arrays;
class sort
{
public static void main(String args[])
{
int a[]={4,1,6,3,8,5,3,9};

System.out.println("Unsorted array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
Arrays.sort(a);
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}