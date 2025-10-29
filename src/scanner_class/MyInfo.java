package scanner_class;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("*********Enter Your Information*********");

		System.out.println("What's Your Name");

		scanner.nextLine();

		System.out.println("What's Your Age");
		scanner.nextInt();

		System.out.println("What's Your Height");
		scanner.nextFloat();

		System.out.println("What's Your Weight");
		scanner.nextDouble();

		System.out.println("What's Your CellPhone Number");
		scanner.nextLong();

		System.out.println("Thank You, Have A Nice Day :)");

		scanner.close();
	}

}
