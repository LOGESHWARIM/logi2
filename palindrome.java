/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,remainder,rev=0,original;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		original=num;
		if(num<=1000)
		{
		while(num!=0)
		{
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		if(original==rev)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
	}
}
