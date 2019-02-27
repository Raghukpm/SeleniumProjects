package SRC;
//Inhg1.java
class InhBC
{
	int a;
	void disp()
	{
		System.out.println("BC---Disp");
	}
}//InhBC

class InhDC extends InhBC 
{
	int b;
	void show()
	{
		System.out.println("DC----Show");
		a=100;//-->BC class data member
		b=200;//-->DC class data member
		System.out.println("Value of a (BC) "+a);
		System.out.println("Value of b (DC)"+b);
	}
}//InhDC

public class Inhg1 {
	public static void main(String args[])
	{
		System.out.println("W.R.T DC");
		InhDC do1=new InhDC();
		do1.disp();
		do1.show();
		System.out.println("W.R.T BC");
		InhBC bo1=new InhBC();
		bo1.disp();
		//bo1.show();--Error// 
	}

}
