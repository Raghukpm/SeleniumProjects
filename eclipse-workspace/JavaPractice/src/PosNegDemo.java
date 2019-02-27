//PosNegDemo.java

class PosNeg{
	
	int n;
	
	void accept(int x)
	{
		n=x;
		
	}//accept
	void decide()
	{
	  if(n>0)
	  {
		  System.out.println(n+ " Is Positive Integer value ");
	  }
	  else 
	  {
		  if(n<0)
		  {
			  System.out.println(n+" Is Negitive Interger Value");
		  }
		  else 
		  {
			  System.out.println(n+ " Is ZERO");
		  }
	  }//else
		
	}//decide
	
}//PosNeg

public class PosNegDemo {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Plz enter one value from Cmd Prompt");
		}
		else
		{
			int a=Integer.parseInt(args[0]);
			PosNeg pn=new PosNeg();
			pn.accept(a);
			pn.decide();
			
		}//else
	
	}//main
		
}//PosNegDemo
