package com;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try
		{
			String s1=args[0];
			String s2=args[1];
		int x1=Integer.parseInt(s1);
		int x2=Integer.parseInt(s2);
		int x3=x1/x2;

		System.out.println("-------------*****************---------------------");
		
		System.out.println("Division is ="+x3);
		
			
		}catch(ArithmeticException ae)
		{
			System.out.println("-------------*****************---------------------");
			System.out.println("Don't enter 0 Zero for denominator ");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Don't enter Alpha numeric values/special symbols ");
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("Plz enter two values ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("From Finally block :--");
			
			System.out.println("-------------*****************---------------------");
		}
	}//main 

}//ExceptionHandling
