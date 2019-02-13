//EmpDemo.java
package com;

import java.util.Scanner;
import com.*;

public class EmpDemo {

	public static void main(String[] args) throws NumberFormatException, PosSalExcep, NumberFormatException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur salary");
		String sal = s.nextLine();
		EmpExcep eo = new EmpExcep();
		try {
			eo.decide(sal);
		} catch (NegSalExcep ne) {
			System.err.println("Don't enter Negtive or Zero for salary");
		} catch (PosSalExcep po) {
			System.err.println("Good Sal try for best");
		} catch (NumberFormatException nfe) {
			System.err.println("Don't enter Aplha-numeric values and special symbols for Salary");

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			System.out.println("I'M from Finally block");
		}

	}// main

}// EmpDemo--prog def specific class
