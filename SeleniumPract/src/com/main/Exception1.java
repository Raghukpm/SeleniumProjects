package com.main;

import java.util.Scanner;

public class Exception1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Plz enter inputs ");	
		String s1=s.nextLine();
		String s2=s.nextLine();
		int x1=Integer.parseInt(s1);
		int x2=Integer.parseInt(s2);
		int x3=x1/x2;
		System.out.println("the Division is "+x3);
		}catch(ArithmeticException ae)
		{
			System.out.println("Don't enter 0(ZERO) FOR denominator");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Don't enter alpha numerical,Special symbols");
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Pls enter two values ");
		}
		finally {
			System.out.println("I'm from Finally block");
		}
		
	}//main()

}//Exception1
