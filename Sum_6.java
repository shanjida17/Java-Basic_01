package basic1;

import java.util.Scanner;

public class Sum_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int x = in.nextInt();

		System.out.print("Input second number: ");
		int y = in.nextInt();

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " x " + y + " = " + x * y);
		System.out.println(x + " / " + y + " = " + x / y);
		System.out.println(x + " mod " + y + " = " + x % y);
	}

}
