package lab.exercise;
import java.util.Scanner;

public class AreaOfSquare {

		public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the side of square and press enter");
				double side = scan.nextDouble();
				double area = side * side;
				System.out.println("The area of Square is "+ area);
			}
}