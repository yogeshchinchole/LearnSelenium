package com.learnjava.learnings;

import java.util.Scanner;

public class operationsdemo {

	public static void main(String[] args) {
		int math, sci, mar, eng, hist, geo, soc;
		double tmarks, tavg;
		Scanner inmarks = new Scanner(System.in);

		System.out.println("Please Enter Math Marks");
		math = inmarks.nextInt();
		System.out.println("Math Marks are: " + math);
		System.out.println("Please Enter Sceience Marks");
		sci = inmarks.nextInt();
		System.out.println("Sceince Marks are: " + math);
		System.out.println("Please Enter Marathi Marks");
		mar = inmarks.nextInt();
		System.out.println("Marathi Marks are: " + math);
		System.out.println("Please Enter History Marks");
		hist = inmarks.nextInt();
		System.out.println("History Marks are: " + math);
		System.out.println("Please Enter English Marks");
		eng = inmarks.nextInt();
		System.out.println("English Marks are: " + math);
		System.out.println("Please Enter Geograhy Marks");
		geo = inmarks.nextInt();
		System.out.println("Geography Marks are: " + math);
		System.out.println("Please Enter Social Science Marks");
		soc = inmarks.nextInt();
		System.out.println("Social Science Marks are: " + math);
		tmarks = math + sci + mar + eng + hist + geo + soc;
		tavg = tmarks / 7;

		System.out.println("Your Total Percentage are: " + tavg);

	}

}
