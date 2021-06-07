package lab.exercise;

import java.util.Scanner;
public class FactorialDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number press enter");
		int number = scan.nextInt();
		
		int factorail = fact(number);
		System.out.println("The factorail of given number is "+factorail);
	}
	
	static int fact(int number)
	{
	  int output;
	  if(number == 1)
	  {
		  return 1;
	  }
	  output = fact(number-1)*number;
	  return output;
	}
}