
class CmdLineArgsDemo {
	
	double p,q,sum,sub,mul,div;
	
	void input(double x,double y)
	{
		p=x;
		q=y;
		
	}//input
	
	void caculate()
	{
		sum=p+q;
		sub=p-q;
		mul=p*q;
		div=p/q;
		
	}//calculate
	
	void disp()
	{
		System.out.println("Inut values:"+p +"And"+q);
		System.out.println("Addition IS:"+sum);
		System.out.println("Substration Is:"+sub);
		System.out.println("Multiplication Is:"+mul);
			
	}//disp

}//CmdLineArgsDemo

public class CmdLineArgs
{
	public static void main(String []args)
	{
		if (args.length!=2)
		{
			System.out.println("plZ enter minimum two values from CMD Prmpt");
		}
		else
		{
			//coverting CMD line args into fundmental Data types
			
			double a=Double.parseDouble(args[0]);
			double b=Double.parseDouble(args[1]);
			
			//creating Obj
			CmdLineArgsDemo cmd=new CmdLineArgsDemo();
			cmd.input(a, b);
			cmd.caculate();
			cmd.disp();
		}//else
		
	}//main
	
}//CmdLineArgs
