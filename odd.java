import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a<=100000 && b<=100000)
		{
		for(int i=a+1;i<b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(""+i);
			}
		}
		} 
	}
}
