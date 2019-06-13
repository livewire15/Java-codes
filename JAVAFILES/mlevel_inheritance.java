class a
{
public void method1()
{
System.out.println("h1");
}
}
class b extends a
{
public void method1()
{
System.out.println("h2");
}
}

class mlevel_inheritance
{
public static void main(String args[])
{
a obj=new b();
obj.method1();
}
}