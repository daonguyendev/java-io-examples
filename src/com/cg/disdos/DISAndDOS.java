package com.cg.disdos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DISAndDOS {

	public static void main(String[] args) {
		String fileName = "D:\\workspace\\backend-java-6-months-course\\"
				+ "module-01-java-core-oop\\sources\\slide-07\\src\\com\\"
				+ "vu\\disdos\\disdos-example.txt";
		
		//Save file
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			DataOutputStream dos = new DataOutputStream(fos);
			final int NUMBER = 5;
			dos.writeInt(NUMBER);
			for (int i=0; i <= NUMBER; i++) {
				dos.writeInt(i);
			}
			dos.writeUTF("Hello VU");
			dos.writeDouble(99.99);
			System.out.println("Save file successfully!");
			dos.flush();
			dos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("Save file failed!");
			e.printStackTrace();
		}
		
		//Read file
		try {
			FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("Integer number is: ");
			int items = dis.readInt();
			for (int i=0; i <= items; i++) {
				int n = dis.readInt();
				System.out.print(n + " ");
			}
			System.out.println("\nUTF data is: " + dis.readUTF());
			System.out.println("Double data is: " + dis.readDouble());
			dis.close();
			fis.close();
		} catch (IOException e) {
			System.out.println("Read file failed!");
			e.printStackTrace();
		}
	}

}
