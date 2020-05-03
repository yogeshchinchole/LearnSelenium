package com.learnjava.learnings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutPutFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("E:\\Selenium\\testme.txt");
		FileWriter fb = new FileWriter(f);
		BufferedWriter bfr = new BufferedWriter(fb);

		bfr.newLine();
		bfr.write("Test File Creation has been done");
		System.out.println("File Has been Created");
		bfr.close();

		FileReader fr = new FileReader(f);
		BufferedReader rbf = new BufferedReader(fr);

		while (rbf.readLine() != null) {
			System.out.println(rbf.readLine());
		}

		rbf.close();
	}

}
