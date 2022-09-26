import java.util.Scanner;
class Multiply{
public static void main(String []args){
  
int x, y, c;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number: ");  
x = sc.nextInt();  
System.out.println("Enter the second number: ");  
y = sc.nextInt(); 
int c=x*y;
System.out.println("The sum of two numbers x and y is: " + c);  
}  
}