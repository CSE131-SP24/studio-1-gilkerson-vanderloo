package studio1;
import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please give an integer.");
		int n1 = in.nextInt();
		System.out.println("Please give another integer.");
		int n2 = in.nextInt();
		
		double average = (n1 + n2) / 2.0;
		System.out.println("The average of the two numbers is " + average + ".");
	}
}
