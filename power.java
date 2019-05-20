import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int b,e;
		long v=1;
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		e=s.nextInt();
		System.out.println(+b);
		System.out.println(+e);
		while(e!=0)
		{
			v=v*b;
			e--;
		}
		System.out.println(+v);
	}
}
