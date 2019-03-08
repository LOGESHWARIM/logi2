/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	int x,y, ch;

        System.out.println("1.Add 2.Sub 3.Div 4.Mul");
        System.out.println("Enter your choice");
        Scanner var = new Scanner(System.in);

        ch = var.nextInt();
        System.out.println("Enter first number");
        x = var.nextInt();
        System.out.println("Enter second number");
        y = var.nextInt();
        float c;

        switch (ch) 
        {
            case 1:
                c = x + y;
                System.out.println("Output" + c);
                break;

            case 2:
                c = x - y;
                System.out.println("Output" + c);
                break;

            case 3:
                c = x / y;
                System.out.println("Output" + c);
                break;

            case 4:
                c = x * y;
                System.out.println("Output" + c);
                break;
        }
    }
}
