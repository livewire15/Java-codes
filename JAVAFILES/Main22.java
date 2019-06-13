class Test22 extends Exception
{
}
class Derived extends Test22
{
}
public class Main24
{
public static void main(String args[])
{
	try
	{
		throw new Derived();
	}
	catch(Base b)
	{
		System.out.println("Caught the Test excep");
	}
	catch(Derived d)
	{
		System.out.println("derived");
	}
}
}