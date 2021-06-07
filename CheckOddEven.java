package lab.exercise;
import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if(num % 2 == 0)
		{
			System.out.println(num+" is a Even Number");
		}
		else 
		{
			System.out.println(num+" is a Odd Number");
		}
		
	}
}