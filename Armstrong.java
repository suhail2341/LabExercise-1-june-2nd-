package lab.exercise;

public class Armstrong {

	public static void main(String[] args) {
		
		int number = 371, originalNumber = number, remainder, result = 0;
   
		while(originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result = result + (int) Math.pow(remainder, 3);
			originalNumber = originalNumber / 10;
		}
		
		if(result == number)
		{
			System.out.println(number+" is a Armstrong");
		}
		else
		{
			System.out.println(number+" is not a Armstrong");
		}
	}
}