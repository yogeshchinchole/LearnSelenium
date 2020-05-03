package com.learnjava.learnings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WritingToNotepad {

	public static void main(String[] args) throws IOException {

		File nf = new File("E:\\Selenium\\testhere.txt");
		nf.createNewFile();
		/*
		 * FileWriter flw = new FileWriter(nf); BufferedWriter bfw = new
		 * BufferedWriter(flw);
		 * 
		 * bfw.write("This is test line to wrte in file"); bfw.newLine();
		 * bfw.write("This is test 2nd line to wrte in file"); bfw.newLine();
		 * bfw.write("This is test 3rd line to wrte in file");
		 * 
		 * bfw.flush();
		 */
		FileReader fr = new FileReader(nf);
		BufferedReader bfr = new BufferedReader(fr);

		while (bfr.readLine() != null) {
			System.out.println(bfr.readLine());
		}

	}

}
