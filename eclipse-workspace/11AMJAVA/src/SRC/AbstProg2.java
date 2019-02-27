package SRC;
//AbstProg2.java
import java.util.Scanner;
abstract class Swap
{
	Scanner s=new Scanner(System.in);
	abstract void swapVal();
}//Swap--AC

class IntSwap extends Swap
{
	void swapVal()
	{
	System.out.println("Plz enter Int values for swap :");	
	int a=Integer.parseInt(s.nextLine() );
	int b=Integer.parseInt(s.nextLine());
	System.out.println("Original Value of A:"+a);
	System.out.println("Original Value of B:"+b);
	System.out.println("===============================");
	int t=a;
	a=b;
	b=t;
	System.out.println("Interger Swapped Value of A :"+a);
	System.out.println("Integer Swapped Value of B :"+b);
	System.out.println("================================");
	}//swapVal
}//IntSwap-Implemented class 

class CharSwap extends Swap
{
	void swapVal()
	{
	   System.out.println("ENter Char values to swap :");
	   String a=s.nextLine();
	   String b=s.nextLine();
	   if ((a.length()>1)||(b.length()>1))
	   {
		   System.out.println("You enterded String & Pls enter chars :");
	   }//
	   else
	   {
		  char x=a.charAt(0);
		  char y=b.charAt(0);
		  System.out.println("OriginaL CHAR values :"+x+","+y);
		  char t=y;
		  y=x;
		  x=t;
		  System.out.println("Swapped Values a,b:"+x+","+y);
		  
	   }//else
	}//swapVal
}//CharSwap--Impl class

public class AbstProg2 {
	public static void main(String []args)
	{
		Swap os=new IntSwap();
		os.swapVal();
		os=new CharSwap();
		os.swapVal();
	}//main()

}//AbstProg2
