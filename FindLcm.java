package lab.exercise;

public class FindLcm {

	public static void main(String[] args)
	{
		int n1 = 2, n2 = 2, lcm;
		
		// Maximun number between n1 and n2 is stored in lcm variable
		lcm = (n1>n2)?n1:n2;
		
		while(true)
		{
			if(lcm % n1 == 0 && lcm % n2 ==0)
			{
				System.out.printf("THe LCM of %d and %d is %d",n1,n2,lcm);
				break;
			}
			lcm++;
		}
		
	}
}