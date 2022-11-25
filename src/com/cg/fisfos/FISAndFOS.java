package com.cg.fisfos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISAndFOS {

	public static void main(String[] args) {
		//Save file
		try {
			String fileName = "D:\\workspace\\backend-java-6-months-course\\"
					+ "module-01-java-core-oop\\sources\\slide-07\\src\\com\\"
					+ "vu\\fisfos\\fisfos-example.txt";
			FileOutputStream fos = new FileOutputStream(fileName);
			byte[] data = "Hello FIS an FOS example".getBytes();
			fos.write(data);
			System.out.println("Save file successfully!");
			fos.close();
		} catch (IOException e) {
			System.out.println("Save file failed!");
			e.printStackTrace();
		}
		
		//Read file
		try {
			String fileName = "D:\\workspace\\backend-java-6-months-course\\"
					+ "module-01-java-core-oop\\sources\\slide-07\\src\\com\\"
					+ "vu\\fisfos\\fisfos-example.txt";
			FileInputStream fis = new FileInputStream(fileName);
			int n = fis.available();
			byte[] data = new byte[n];
			fis.read(data);
			System.out.println("File content is: " + new String(data));
			fis.close();
		} catch (IOException e) {
			System.out.println("Read file failed!");
			e.printStackTrace();
		}
	}

}
