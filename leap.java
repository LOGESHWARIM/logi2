/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		boolean leap = false;
		int y;
		Scanner s=new Scanner(System.in);
		y=s.nextInt();
		 if(y % 4 == 0)
        {
            if( y % 100 == 0)
            {
                if ( y % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
