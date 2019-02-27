package SRC;

class DigitSum
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void findsum()
	{
		if(n<=0)
		{
			System.out.println(n+" Inavid plz enter the +Ve value  ");
		}
		else
		{   int s=0;
			while(n>0)
			{
				int dig=n%10;
				s=s+dig;
				n=n/10;
			}//while
			System.out.println("Digit sum is "+s);
		}//else
	}//findsum
	
}//DigitSum

public class DigitSumDemo {
	
	public static void main(String []k)
	{
		if(k.length!=1)
		{
			System.out.println("Plz enter the one value from CMD prompt");
		}
		else
		{
			int x=Integer.parseInt(k[0]);
			DigitSum ds=new DigitSum();
			ds.set(x);
			ds.findsum();
		}//else
	}//main()

}//DigitSumDemo
