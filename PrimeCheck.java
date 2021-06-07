package lab.exercise;
import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number and press enter");
		int number = scan.nextInt();
		int count = 0;
		
		for(int i=1;i<=number;i++)
		{
		   if(number%i==0)
		   {
			   count++;
		   }
		}
		if(count==2)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
			
	}
}