class static1
{
	void method()
	{
		System.out.println("hello1");
	}
}
class static2
{
	void method()
	{
		System.out.println("hello2");
	}
}
class static3 extends static1,static2
{
	public static void main(String args[])
	{
		static3 obj=new static3();
		obj.method();
	}
}

