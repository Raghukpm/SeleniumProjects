package SRC;
import java.util.Scanner;
abstract class swap
{
	Scanner s=new Scanner(System.in);
	abstract void Swapval();
}//swap--->AC
class intSwap extends swap
{
	void Swapval()
	{
	 System.out.println("Enter two int two values :");
	 int a=Integer.parseInt(s.nextLine());
	 int b=Integer.parseInt(s.nextLine());
	 System.out.println("Original values of a,b"+a+","+b);
	 int t=a;
	     b=a;
	     a=t;
	 System.out.println("Swapped value of A :"+a);    
	 System.out.println("Swapped value of B :"+b);
	}
}//intSwap

class charswap extends swap
{
	void Swapval()
	{
		System.out.println("Enter two values :");
		String x=s.nextLine();
		String y=s.nextLine();
		
		if((x.length()>1)||(y.length()>1))
		{
			System.out.println("U entered String values,Plz enter chars ");
		}
		else 
		{
			char a=x.charAt(0);
			char b=y.charAt(0);
			System.out.println("Original value of A"+a);
			System.out.println("Original value of B"+b);
			char t=a;
			b=a;
			a=t;
			System.out.println("Swapped value of A"+a);
			System.out.println("Swapped value of B"+b);
		}//else
	}
}//charswap--Impl class

public class SwapAbst 
{
public static void main(String[] args) {
	swap so=new intSwap();
	so.Swapval();
	swap co=new charswap();
	co.Swapval();
}
}
