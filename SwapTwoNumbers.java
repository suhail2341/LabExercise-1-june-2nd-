package lab.exercise;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 23, second = 32;
		System.out.println("__Before Swap__");
		System.out.println("First Number"+ first);
		System.out.println("Second Numberr"+ second);
		
		int temporary = first;
		first = second;
		second = temporary;
		System.out.println("__After Swap__");
		System.out.println("First Number"+ first);
		System.out.println("Second Numberr"+ second);
		
	}

}