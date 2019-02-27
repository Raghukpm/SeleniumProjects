//PosNEGDEMO.java

class PosNegZero1
{
	int n;
	
	void set(int x)
	
	{
		n=x;
	}
	
	void deside()
	{
		if (n>0)
		{
			System.out.println( n+"Is Positive ");
		}
		else
		{
			if (n<0)
			{
			System.out.println( n+"Is Negitive");
			}
			else 
			{
				System.out.println(n+"Is Zero 0");
			}
			
		}//else
		
	}//deside()
	
}//PosNegZero

  class PosNEGDEMO1
 {
	 public static void main(String [] args)
	 {
		 if(args.length!=1)
		 {
			 System.out.println("Enter one from command prompt");
		 }
		 else
		 {
			 int p=Integer.parseInt(args[0]);
			 PosNegZero pn=new PosNegZero();
			 pn.set(p);
			 pn.deside();
			 
		 }//else
		 
		 
	}//main
	 
 }//PosNEGDEMO