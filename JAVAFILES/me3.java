class Test22 extends Exception
{
}
class Main22
{
public static void main(String args[])
{
	try
	{
		throw new Test22();
	}
	catch(Test22 t)
	{
		System.out.println("Got the Test excep");
	}
	finally
	{
		System.out.println("finally");
	}
}
}