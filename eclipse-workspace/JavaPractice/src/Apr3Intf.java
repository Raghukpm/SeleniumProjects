//Apr3Intf.java

interface I1
{
	void f1();
}//I1-->BI

interface I2 extends I1
{
	void f2();
	
}//I2-->DI

abstract class C1
{
	void f3()
	{
		//Null Body Methods 
	}
}//C1-->ACC

class CDC3 extends C1 implements I1,I2
{

     public void f2() {
		 System.out.println("f2() Overiiden in --C3");
		
	}	 
	public void f1() {
	 
		 System.out.println("f1() Overiiden in --C3");
	}
	
	void f3()
	{
		System.out.println("f3() Overiiden in --C3");
	}
	void f4()
	{
		System.out.println("f4() Special in --C3");
	}//f4()
}//C3-->CDC


public class Apr3Intf {
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("W.R.T I1--Interface ");
		I1 io1=new CDC3();
		io1.f1();
		System.out.println("-----------------------------------");
		System.out.println("W.R.T I1--Interface ");
		I2 io2=new CDC3();
		io2.f2();
		io2.f1();
		System.out.println("-----------------------------------");
		System.out.println("W.R.T C1--ACC");
		C1 co=new CDC3();
		co.f3();
		System.out.println("-----------------------------------");
		System.out.println("W.R.T CDC3--CDC");
		CDC3 cd1=new CDC3();
		cd1.f1();
		cd1.f2();
		cd1.f3();
		cd1.f4();
		System.out.println("-----------------------------------");
	}//main()

}//Apr3Intf
