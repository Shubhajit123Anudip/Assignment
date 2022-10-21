/*Write a program in Java to display the cube of the number upto given an integer.*/
package Assginment.java;
import java.util.Scanner;
public class Cube {

	   public static void main(String[] args)
    {
	    int i,n;
	    System.out.print("Input number of terms : ");
	    try (Scanner in = new Scanner(System.in)) {
			n = in.nextInt();
		}
			    for(i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
	    }
	 }
	}

