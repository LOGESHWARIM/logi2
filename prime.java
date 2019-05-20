import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,m=0,flag=0;      
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n<=1000)
		{
		m=n/2;      
		if(n==0||n==1)
		{  
			System.out.println("no");      
		}
		else
		{	  
			for(i=2;i<=m;i++)
			{      
    			if(n%i==0)	
    			{
    				System.out.println("no");      
    				flag=1;      
    				break;      
    			}      
			}      
			if(flag==0)  
			{	 
   				System.out.println("yes"); 
			}
		}
		}
	}
}
