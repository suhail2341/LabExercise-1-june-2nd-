package lab.exercise;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a new year");
		int year = scan.nextInt();
		
		boolean isleap = false;
		
		if(year % 4 == 0)
		{
			isleap = true;
		}
		if(isleap == true) {
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
	}
}