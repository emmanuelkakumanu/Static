
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int a=7;
	static int b=8;
	int c=79,d=34;
	static void static_fun1()
	{
		System.out.println("Static variable a : "+a);	
		
	}
	static void static_fun2()
	{
		System.out.println("static variable b : "+b);
	}
	void fun1()
	{
		System.out.println("instance variable c : "+c);
	}
	void fun2()
	{
		System.out.println("instance variable d : "+d);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone obj=new Ideone();
		Ideone.static_fun1();
		obj.static_fun2();
		obj.fun1();
		obj.fun2();
	}
}
