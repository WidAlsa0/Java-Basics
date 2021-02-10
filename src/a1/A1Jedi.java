package a1;

import java.util.Scanner;

public class A1Jedi {

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

		int[] itemQuantity = new int[storeItems];
		int[] customerQuantity = new int[storeItems];

		// The second part of the code will take in the customer information
		int customers = scan.nextInt();

		for (int i =0; i<customers; i++) {
			String First = scan.next();
			String Last = scan.next();

			int items = scan.nextInt();

			for (int a =0; a < items; a++) {
				int quantity = scan.nextInt();
				String givenItem = scan.next();
				int foundItem = -1;

				for (int b = 0; b < storeItems; b++) {
					if (givenItem.equals(nameItems[b])) {
						foundItem = b;
					}
				}

				itemQuantity[foundItem] = itemQuantity[foundItem] + quantity;
				customerQuantity[foundItem] = customerQuantity[foundItem] + 1;
			}

		}

		for (int i=0; i < storeItems; i++) {
			if (itemQuantity[i] == 0) {
				System.out.println("No customers bought " + nameItems[i]);
			} else {
				System.out.println(customerQuantity[i] + " customers bought " + itemQuantity[i] + " " + nameItems[i]);
			}
		}

		
	}
}
