import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,sum=0,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		k=s.nextInt();
		for(j=0;j<k;j++)
		{
			sum=sum+a[j];	
		}
		System.out.println(+sum);
	}
}
