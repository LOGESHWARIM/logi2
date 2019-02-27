import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int b,e,result=1;
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		e=s.nextInt();
		while(e!=0)
		{
			result=result*b;
			--e;
		}
		System.out.println(+result);
    }
}
