package com.learnjava.learnings;

public class firstjava {

	// regular method to print 5 table
	void t1() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
	}

	// method using parameter passing to print table for any value
	void t1(int mp) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", mp, i, mp * i).println();
		}
	}

	// method using parameter passing to print table for any value for any from and
	// to value
	void t1(int mp, int from, int to) {
		for (int i = from; from <= to; from++) {
			System.out.printf("%d * %d = %d", mp, from, mp * from).println();
		}
	}

}
