package SRC;
//IntfPrg1.java
 interface I1
{
	void f1();//by default it will be Public abstract void f1()
}//I1

interface I2
{
	void f2();//by default it will be Public abstract void f1()
}//I2

class dc1 implements I1,I2
{
	public void f1()
	{
		System.out.println("f1() overridden in---C1");
	}
	public void f2()
	{
		System.out.println("f2 overridden in ---C2");
	}
	void f3()
	{
		System.out.println("f3--Special in--C3");
	}
}//C1-Implementation class 

public class IntfPrg1 {
	
	public static void main(String[] args) {
		
		System.out.println("W.R.T C1-->DOC");
		dc1 o1=new dc1();
		o1.f1();
		o1.f2();
		o1.f3();
		System.out.println("W.R.T I1 in DOC");
		//I1 io=new I1();invalid I1 is by default abstract 
		System.out.println("W.R.T I1 in IN-DOC");
		I1 io1=new dc1();
		io1.f1();
		//io1.f2();--invalid because I1 doesn't contain f2()
		
		
	}//main()

}//IntfPrg1
