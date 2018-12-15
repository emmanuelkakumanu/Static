
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int a=89,b=123;
	int c=77,d=90;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//instance variables can only be accessed using object within static methods 
		Ideone obj=new Ideone();
		System.out.println("static variable a : "+a);
		System.out.println("static variable b : "+b);
		System.out.println("instance variable c : "+obj.c);
		System.out.println("instance variable d : "+obj.d);
	}
}
