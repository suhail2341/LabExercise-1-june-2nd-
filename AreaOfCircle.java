package lab.exercise;
import java.util.Scanner;

public class AreaOfCircle {

		public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the radius of circle and press enter");
				double radius = scan.nextDouble();
			
				double area = Math.PI *(radius*radius);
				System.out.println("The area of circle is "+ area);
			}
}