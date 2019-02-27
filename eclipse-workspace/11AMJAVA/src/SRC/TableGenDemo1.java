package SRC;
//TableGenDemo1

class TableGen1{
	
	int n;
	
	public void set(int x)
	{
		n=x;
	}
	void decide()
	{
		if(n<=0)
		{
			System.out.println(n+ " Is Invaid Please enter +ve value ");
		}
		else 
		{    int i=1;
		  System.out.println("\t\tTAble Generation");
			//while(n<=10)
		  for(i=1;i<=10;i++)
			{
				System.out.println("\t\t"+n+"*"+i+"="+(n*i));
				
			
			}//while
			
			i=i+1;
		}//else
		
	}//decide()
	
	
}//TableGen


public class TableGenDemo1 {
	public static void main(String k[])
	{
		if(k.length!=1)
		{
			System.out.println("Plz enter one val from CMD");
		}
		else
		{
			int a=Integer.parseInt(k[0]);
			TableGen1 tg=new TableGen1();
			tg.set(a);
			tg.decide();
			
		}//else
	}//main()

}//TableGenDemo1
