package calculate_package;
import java.util.*;

public class Calculator {
	// 1. Addition (+)
	public static int addition(int a,int b) {
		return a+b;
	}
	// 2. Subtraction (-)
	public static int subtraction(int a,int b) {
		if(a>b) return a-b;
		else return b-a;
	}
	// 3. Multiplication (*)
	public static int multiplication(int a,int b) {
		return a*b;
	}
	// 4. Division (/)
	public static double division(int num1,int num2) {
		double a = num1;
		double b = num2;
		if(a>b) return a/b;
		else return b/a;
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Console Calculator ===");
		boolean calculate = true;
		while(calculate) {
			System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = sc.nextInt();
            
            if(choice==5 || choice<0 || choice>5) {
            	calculate = false;
            	System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
			System.out.println("Enter the 1st number:");
			int num1 = sc.nextInt();
			System.out.println("Enter the 2nd number:");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			switch(choice) {
				case 1:
					System.out.println("Congrats!!! You chooses Addition");
					result = addition(num1,num2);
					System.out.println("Addition of the numbers is :"+result);
					break;
				case 2:
					System.out.println("Congrats!!! You chooses Subtraction");
					result = subtraction(num1,num2);
					System.out.println("Subtraction of the numbers is :"+result);
					break;
					
				case 3:
					System.out.println("Congrats!!! You chooses Multiplication");
					result = multiplication(num1,num2);
					System.out.println("Multiplication of the numbers is :"+result);
					break;
				
				case 4:
				    System.out.println("Congrats!!! You chose Division");

				    // Ask for second number again if it's zero
				    while (num2 == 0) {
				        System.out.println("Division by zero is not allowed. Please enter a non-zero second number:");
				        num2 = sc.nextInt();
				    }

				    double answer = division(num1, num2);
				    System.out.println("Division of the numbers is: " + answer);
				    break;
					
				default:
					System.out.println("Invalid choice. Please select a valid option.");
			}			
		}
	}
}
