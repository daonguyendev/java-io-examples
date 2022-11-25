package com.cg.objectarray;

import java.util.Scanner;

public class ManageFraction {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Fraction myFraction = input();
		output(myFraction);
	}
	
	private static Fraction input() {
		System.out.print("Enter numerator: ");
		int numerator = sc.nextInt();
		System.out.print("Enter denominator: ");
		int denominator = sc.nextInt();
		
		Fraction fraction = new Fraction(numerator, denominator);
		return fraction;
	}
	
	private static void output(Fraction fraction) {
		System.out.printf("Fraction is: %d/%d", fraction.getNumerator(), 
												 fraction.getDenominator());
	}
}
