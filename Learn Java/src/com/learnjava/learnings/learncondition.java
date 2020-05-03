package com.learnjava.learnings;

import java.util.Scanner;

public class learncondition {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);

		// if else

		c = sc.nextInt();

		if (c == 1) {
			System.out.println("This is one");
		} else {
			System.out.println("This is not 2");
		}

		// switch case

		switch (c) {
		case 1:
			System.out.println("This is 1");
			break;
		case 2:
			System.out.println("This is 2");
			break;
		default:
			System.out.println("This is something different");
		}

		if ((c % 2) == 1) {
			System.out.println("Number is Prime");
		}

	}

}
