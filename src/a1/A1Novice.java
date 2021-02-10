package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int customers = scan.nextInt();

		for (int i =0; i < customers; i++) {

			// Scans the names, prints out in proper format
			String first = scan.next();
			String last = scan.next();


			// scans number of items per customer, and loops through each item
			int items = scan.nextInt();
			double finalSale = 0;
			for (int a=0; a < items; a++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();

				finalSale = finalSale + (quantity * price);

			}

			System.out.println(first.substring(0,1) + ". " + last + ": " + String.format("%.2f", finalSale));

		}
		
	}
}
