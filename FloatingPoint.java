/*Write a Java program that reads in two floating-point numbers 
and tests whether they are the same up to three decimal places.
 */
package Assginment.java;
import java.util.Scanner;

public class FloatingPoint {
		  public static void main(String[] args)
		    {
		        Scanner in = new Scanner(System.in);

		        System.out.print("Input floating-point number: ");
		        double x = in.nextDouble();
		        System.out.print("Input floating-point another number: ");
		        double y = in.nextDouble();

		        if (x == y)
		        {
		            System.out.println("They are the same up to three decimal places");
		        }
		        else
		        {
		            System.out.println("They are different");
		        }
		    }
}
