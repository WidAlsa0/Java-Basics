package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// The first part of the code will input data for the items in the store
		int storeItems = scan.nextInt();
		String[] nameItems = new String[storeItems];
		double[] priceItems = new double[storeItems];
		for (int i = 0; i < storeItems; i++) {
			nameItems[i] = scan.next();
			priceItems[i] = scan.nextDouble();
		}

		// The second part of the code will take in the customer information
		int customers = scan.nextInt();

		double average = 0;
		double biggest = 0;
		double smallest = 7000;
		String biggestFirst = "";
		String biggestLast = "";
		String smallestFirst = "";
		String smallestLast = "";

		for (int i =0; i<customers; i++) {
			String First = scan.next();
			String Last = scan.next();

			int items = scan.nextInt();
			double custSale = 0.00;

			for (int a =0; a < items; a++) {
				int quantity = scan.nextInt();
				String givenItem = scan.next();
				int foundItem = -1;

				for (int b = 0; b < storeItems; b++) {
					if (givenItem.equals(nameItems[b])) {
						foundItem = b;
					}
				}

				custSale = custSale + (quantity * priceItems[foundItem]);

			}

			average = average + custSale;

			if (custSale > biggest) {
				biggest = custSale;
				biggestFirst = First;
				biggestLast = Last;
			}
			if (custSale < smallest) {
				smallest = custSale;
				smallestFirst = First;
				smallestLast = Last;
			}
		}

		System.out.println("Biggest: " + biggestFirst + " " + biggestLast + " (" + String.format("%.2f", (biggest)) + ")");
		System.out.println("Smallest: " + smallestFirst + " " + smallestLast + " (" + String.format("%.2f", smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", (average / customers)));


		
	}
}