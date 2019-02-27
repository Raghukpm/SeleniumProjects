package SRC;

abstract class Figure 
{
	abstract void area();
}//Figure

class circle extends Figure
{
	float r,ac;
	void area()
	{
     r=2.5f;
	ac=3.14f*r*r;
	System.out.println("Area of Circle IS :"+ac);
	
	}
}//Circle--Implementation class 

class Square extends Figure 
{
	int s,sq;
	void area()
	{
		s=5;
		sq=s*s;
		System.out.println("Square of given value is :"+sq);
	}
}
public class AbstDemo1 {
	
	public static void main(String [] k)
	{
		Figure fo=new circle();
		fo.area();
		System.out.println("Circle ref="+fo);//@circle----
		
	}//main()

}//AbstDemo1
