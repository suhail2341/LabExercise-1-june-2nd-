package lab.exercise;

public class SwapNumbers {
   
	public static void main(String[] args) {
		int first = 23, second = 32;
		System.out.println("__Before Swap__");
		System.out.println("First Number"+ first);
		System.out.println("Second Numberr"+ second);
		
		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("__After Swap__");
		System.out.println("First Number"+ first);
		System.out.println("Second Numberr"+ second);
		
	}
}