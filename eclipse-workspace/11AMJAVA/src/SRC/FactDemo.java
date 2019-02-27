package SRC;

class Fact
{
	int in;
	
	void set(int x) 
	{
		in=x;
	}
	void findFact()
	{
		/*if(n<=0)
		{
			System.out.println(n+" IS Invalid Please enter +ve value ");
		}
		else 
		{
			int i =1;
			for(i=1;i<=n;i++)
			{
				
			}//for
		}//else*/
		int f=1;
		int n=1;
		while(n<=in)
			
		{
			f=f*n;
			n=n+1;
		}
		System.out.println("Fact is "+f);
	}//findFact()
	
}//Fact

public class FactDemo {
	
	public static void main(String []k)
	{
		if(k.length!=1)
		{
			System.out.println("Plz enter one value from CMD prpmt");
		}
		else
		{
			int a=Integer.parseInt(k[0]);
		     Fact fp=new Fact();
			fp.set(a);
			fp.findFact();
		}//else
	}//main()

}//FactDemo
