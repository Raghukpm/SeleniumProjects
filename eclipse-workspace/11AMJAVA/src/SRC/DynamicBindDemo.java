package SRC;
import java.util.Scanner;


class IntSum
{
	void add()
	{   
		System.out.println("Enter INt Sum values : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Int Sum : " +c);
	}//int
	
}//IntSum

class FloatSum extends IntSum
{   
	 FloatSum()
	 {
	  super.add();	 
	 }
	void add()
	{
		System.out.println("Enter Float Sum values : ");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float c=a+b;
		System.out.println("flOAT Sum : " +c);
	}
}//FloatSum      

class CharSum extends FloatSum
{
	public CharSum() {
		// TODO Auto-generated constructor stub
		super.add();
	}
	void add()
	{
		char a='A';
		char b='B';
		char c;
		/*c= a+b;
		System.out.println("CharSUm : " +c);*/
	}
	
}//CharSum

public class DynamicBindDemo {
	
    public static void main(String [] k)

    {
    	   IntSum bo1=new CharSum();//INDOC by Dynamic Binding 
    	   bo1.add();
    }//main()
}//DynamicBindDemo--Elc  
