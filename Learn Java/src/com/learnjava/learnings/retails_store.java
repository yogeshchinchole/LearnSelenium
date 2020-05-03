package com.learnjava.learnings;

public class retails_store {

	public static void main(String[] args) {
		int i1 = 10, i2 = 25, i3 = 50;
		double price;

		price = ((i1 * 100) + (i2 * 4) + (i3 * 8));
		System.out.println(price);

		price = price - (0.10 * price);
		System.out.println(price);

		price = price + (0.05 * price);
		System.out.println("Your Total invoice value is: " + price);

		if (price > 1500) {
			System.out.println("Great!!! You are eligible for additional discount of 10%");
		} else {
			System.out.println("Thank you for shoping with us. Please visit again !!!!");

		}

	}

}
