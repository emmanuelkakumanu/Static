
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
		fun1();
		
	}
	void fun()
	{
		//can access static variables in any non static methods.
		System.out.print("Static variable a : "+a);
	}
	static void fun1()
	{
		Ideone o=new Ideone();
		o.fun();
	}
}
