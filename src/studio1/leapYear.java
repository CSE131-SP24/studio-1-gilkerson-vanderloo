package studio1;
import java.util.Scanner;

public class leapYear {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("What is the year you choose?");
		int year = in.nextInt();
		
		boolean leap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		System.out.println("Is the year a leap year?");
		System.out.println(leap);
	}
}
