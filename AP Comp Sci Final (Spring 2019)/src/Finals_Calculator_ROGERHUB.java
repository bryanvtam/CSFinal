import java.util.*;
public class Finals_Calculator_ROGERHUB {

	public static void finalsCalculator() {
		System.out.println("Finals Calculator a.k.a ROGERHUB");
		Scanner userinput = new Scanner(System.in);
		System.out.println("What's your Grade Percentage in the class?");
		double currentGrade = userinput.nextDouble();
		System.out.println("What do you want to end with in the class?");
		double targetgrade = userinput.nextDouble();
		System.out.println("How much is your final weighted?");
		double finalWeight = userinput.nextDouble() / 100;
		
		System.out.println("\n======================================================================================================== \n");
		double finalgrade = ((targetgrade) - ((1-finalWeight) * currentGrade))/ finalWeight;
		System.out.println(finalgrade);
	}


}
