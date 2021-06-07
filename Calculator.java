package lab.exercise;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a choice from below");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int choice = scan.nextInt();
		System.out.println("Enter First Number");
		int number1 = scan.nextInt();
		System.out.println("Enter Second number");
		int number2 = scan.nextInt();
		int result;
		switch(choice)
		{
		case 1:
		result = number1 + number2;
		System.out.println("Sum = "+result);
		break;
		case 2:
		result = number1 - number2;
		System.out.println("Difference = "+result);
		break;
		case 3:
		result = number1 * number2;
		System.out.println("Product = "+result);
		break;
		case 4:
		result = number1 / number2;
		System.out.println("Quotient = "+result);
		break;
		}
	}
}