package lab.exercise;
import java.util.Scanner;

public class AreaOfTriangle {
 
		public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the width of triangle and press enter");
				double base = scan.nextDouble();
				System.out.println("Enter the height of triangle and press enter");
				double height = scan.nextDouble();
				double area = (base*height)/2;
				System.out.println("The area of triangle is "+ area);
			}
	
}