package lab.exercise;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of rectangle and press enter");
		double lenght = scan.nextDouble();
		System.out.println("Enter the width of rectangle and press enter");
		double width = scan.nextDouble();
		double area = lenght * width;
		System.out.println("The area of rectangle is "+ area);
	}
}