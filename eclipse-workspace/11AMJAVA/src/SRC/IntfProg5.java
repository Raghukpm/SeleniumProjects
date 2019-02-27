package SRC;
//IntfProg5.java
import java.util.Scanner;

interface Figure3
{
	void peri();
}


public class IntfProg5  {
	
	public static void main(String[] args) { 
		
		Figure3 fo= ()->  //Lambda Exp
		{
			Scanner s=new Scanner(System.in);
		    System.out.println("Enter values :");
			double sr=Double.parseDouble(s.nextLine());
			double res=4*sr;
			System.out.println("Peri meter is "+res);
			

		};//Functional Interface 
		fo.peri();
	}//main

}//IntfPrg5
