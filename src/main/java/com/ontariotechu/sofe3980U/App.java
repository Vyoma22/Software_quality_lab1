package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;
public class App
{
	/**
	 * Main program: The entry point of the program. The local time will be printed first,
	 *      Then it will perform all binary operations (add, and, or, multiply) on user input.
	 *
	 * @param args: not used
	 */
	public static void main(String[] args)
	{
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first binary number: ");
		String input1 = scanner.nextLine();
		System.out.print("Enter the second binary number: ");
		String input2 = scanner.nextLine();

		Binary binary1 = new Binary(input1);
		Binary binary2 = new Binary(input2);

		System.out.println("\nFirst binary number: " + binary1.getValue());
		System.out.println("Second binary number: " + binary2.getValue());

		// Perform all operations
		Binary sum = Binary.add(binary1, binary2);
		System.out.println("\nResult of addition: " + sum.getValue());

		Binary andResult = Binary.and(binary1, binary2);
		System.out.println("Result of AND operation: " + andResult.getValue());

		Binary orResult = Binary.or(binary1, binary2);
		System.out.println("Result of OR operation: " + orResult.getValue());

		Binary multiplyResult = Binary.multiply(binary1, binary2);
		System.out.println("Result of multiplication: " + multiplyResult.getValue());

		scanner.close();
	}
}
