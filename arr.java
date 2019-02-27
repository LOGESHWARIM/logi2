/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	//	k=s.nextInt();
		int Array[]= new int[n];
		 for(int i=0;i<n;i++)
        {
            Array[i]=s.nextInt();	
        }
        for(int i=0;i<n;i++)
        {
        	System.out.println(Array[i]+"\t");
        }
       /* for(int i=0;i<k;i++)
        {
        	sum=sum+Array[i];
        }
       System.out.println(sum);*/
    }
}
