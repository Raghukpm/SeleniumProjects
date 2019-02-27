package SRC;

abstract class Aop
{
	abstract void operations(double x, double y);
}

class sumop extends Aop
{
	 void operations(double x, double y)
	{
		double z=x+y;
		System.out.println("Sum is"+z);
	}
}//sumop
class subop extends Aop
{
	void operations(double x,double y)
	{
		double z=x-y;
		System.out.println("Substarction is "+z);
	}
}//subop
class MulOp extends Aop
{
	void operations(double x,double y)
	{
		double z=x*y;
		System.out.println("Multiplication is"+z);
	}
}
public class AopAbst {
	public static void main(String[] args) {
		
		Aop ao=new sumop();
		ao.operations(12, 10);
		ao=new subop();
		ao.operations(30, 10);
		ao=new MulOp();
		ao.operations(10, 10);
		
	}

}
