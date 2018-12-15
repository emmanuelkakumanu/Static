
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int a=10;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		obj.fun1();
		
	}
	static void fun()
	{
		System.out.println("Static variable a : "+a);
		System.out.println("static funtcion called from an instance method");
	}
	void fun1()
	{
		//can call using classname or creating an object or just directly as shown below
		fun();
	}
}
