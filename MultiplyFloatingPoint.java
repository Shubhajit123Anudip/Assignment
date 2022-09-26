import java.util.Scanner;
class MultiplyFloatingPoint{
public static void main(String []args){
  
float x, y;
float c;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number: ");  
x = sc.nextFloat();  
System.out.println("Enter the second number: ");  
y = sc.nextFloat(); 
float c=x*y;
System.out.println("The Multiply of two numbers x and y is: " + c);  
}  
}