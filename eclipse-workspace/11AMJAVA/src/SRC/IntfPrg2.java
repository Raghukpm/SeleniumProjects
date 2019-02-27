package SRC;
//IntfPrg2.java
import java.util.Scanner;
interface Circle1
{
	Scanner s=new Scanner(System.in);
	void CirleArea();
	
}//Cirle-->BI
interface Rect 
{
	Scanner s1=new Scanner(System.in);
	void RectArea();
}//DI
interface Square1 
{  
	Scanner s2=new Scanner(System.in);
	void SquareArea();
	
}//Square-->TDI

 class ci2 implements Square1,Circle1,Rect
{
	double pc,pr,ps;
	public double r=Double.parseDouble(s1.next());
	public double l=Double.parseDouble(s2.next());
	public double b=Double.parseDouble(s2.next());
	public double sq=Double.parseDouble(s2.next());
	
	
	public void RectArea() {
		pr=2*(l+b);
		System.out.println("peri meter of Rectangle"+pr);
		
	}
	public void SquareArea() {
		ps=4*sq;
	System.out.println("peri meter of Square"+sq);	
	}
	
	public void CirleArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter vlaues for r,l,b :");
		pc=2*(3.14)*r;
		System.out.println("Perimeter of Circle is "+pc);
		
	}
	
		
	
	
}//c2-concrete implementation class
 
public class IntfPrg2 {
	
	public static void main(String[] args) {
		System.out.println("Starts ");
		Circle1 co=new ci2();
		     co.CirleArea();
		     Rect ro=new ci2();
		     ro.RectArea();
		     Square1 so=new ci2();
		so.SquareArea();
	}//main()

}//IntfPrg2
