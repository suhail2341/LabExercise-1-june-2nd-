package lab.exercise;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number and press enter");
		int number = scan.nextInt();
		int reverseNumber = 0;
		while(number != 0)
		{
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number%10;
			number = number/10;
			
		}
			System.out.println("The reverse of given number "+ reverseNumber);
	}
}