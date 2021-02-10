package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// The number of items in the store
		int total = scan.nextInt();

		// Store name, price, and frequency in arrays
		String[] itemNameArray = new String[total];
		double[] itemPriceArray = new double[total];
		int[] itemAmountArray = new int[total];

		// Given a name and price for each item in the store
		for (int i = 0; i < total; i++) {
			String item_name = scan.next();
			Double item_price = scan.nextDouble();
			itemNameArray[i] = item_name;
			itemPriceArray[i] = item_price;
		}

		// The number of customers given
		int customers = scan.nextInt();


		// Create string array to store customer's first and last name
		String[] first_array = new String[customers];
		String[] last_array = new String[customers];


		// Create integer array to store how many customers got an item
		int[] customerItemPurchase = new int[total];



		// Go through each customer
		for (int i = 0; i < customers; i++) {
			String first = scan.next();
			first_array[i] = first;
			String last = scan.next();
			last_array[i] = last;

			int numberOfItems = scan.nextInt();

			// Create an integer array to check if the customer bought an item before
			int[] customerBought = new int[total];

			for (int a = 0; a < numberOfItems; a++) {
				int quantity = scan.nextInt();
				String givenItemName = scan.next();
				int name_element = findItemNameElement(givenItemName, itemNameArray);
				itemAmountArray[name_element] = itemAmountArray[name_element] + quantity;
				customerBought[name_element] += 1;

				if (customerBought[name_element] == 1)
					customerItemPurchase[name_element] += 1;
			}

		}

		// Print the statements
		for (int i = 0; i < total; i++) {
			if (itemAmountArray[i] == 0) {
				System.out.println("No customers bought " + itemNameArray[i]);
			} else {
				System.out.println(customerItemPurchase[i] + " customers bought " + itemAmountArray[i] + " " + itemNameArray[i]);
			}

		}


	}

	private static int findItemNameElement(String givenItemName, String[] itemNameArray) {
		int element = -1;
		for (int i = 0; i < itemNameArray.length; i++) {
			if (givenItemName.equals(itemNameArray[i])) {
				element = i;
			}
		}
		return element;
	}

	}
