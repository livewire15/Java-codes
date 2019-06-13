import java.io.*;
class hello
{
void method(int num)throws IOException,ClassNotFoundException
{
if (num==1)
throw new IOException("h1");
else
throw new ClassNotFoundException("h2");
}
}

class exception
{
public static void main(String args[])
{
try
{
hello obj=new hello();
obj.method(1);
}
catch(Exception e){
System.out.println(e);
}
}
}
