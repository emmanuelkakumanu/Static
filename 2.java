
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int a=10;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		fun();
		
	}
	static void fun()
	{
		//create an object for the class w=using which we can access instance variables in static methods.
		Ideone obj1=new Ideone();
		System.out.print(obj1.a);
	}
}
