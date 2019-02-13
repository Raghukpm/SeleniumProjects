package com;

import java.util.Scanner;
import com.NameFormatException;

public class NameValidationDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Pls the Name or product");
		String name = s.nextLine();
		NameValidation nv = new NameValidation();

		try {
			nv.validate(name);
		} catch (NameFormatException nf) {
			System.err.println("Ur name shouldn't contain digits");
		} catch (Exception e) {
			System.err.println(e);
		}

	}// main

}// NameValidationDemo
