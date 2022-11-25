package com.cg.oisoos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OISAndOOS {

	public static void main(String[] args) {
		String fileName = "D:\\workspace\\backend-java-6-months-course\\"
				+ "module-01-java-core-oop\\sources\\slide-07\\src\\com\\"
				+ "vu\\oisoos\\oisoos-example.txt";
		
		//Save file
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Course[] courses = {
					new Course(1, "ReactJS", "Frontend ReactJS", 9, 15000),
					new Course(2, "NextJS", "Frontend NextJS", 6, 15000),
					new Course(3, "Angular", "Frontend Angular", 8, 15000),
					new Course(4, "VueJS", "Frontend VueJS", 9, 15000)
			};
			oos.writeObject(courses);
			System.out.println("Save file successfully!");
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Save file failed!");
			e.printStackTrace();
		}
		
		//Read file
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Course[] courses = (Course[]) ois.readObject();
			System.out.println("List of courses is: ");
			for (Course course: courses) {
				System.out.println(course);
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Read file failed!");
			e.printStackTrace();
		}
	}

}
