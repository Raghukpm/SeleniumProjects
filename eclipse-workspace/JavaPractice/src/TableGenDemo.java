//TableGenDemo.java
class TableGen
{
	int n;
	
   void accept(int x)
	{
		int n=x;
		
    }//accept()
	
	void calc()
	{  
		if(n<=0)
		{
			System.out.println(n+ "IS Invalid please enter +ve value");
		}
		else
		{
		System.out.println("\t\tTable generation : ");
      //for(int i=1;i<=10;i++)
		int i=1;
		while(i<=10)
      {
    	    
    	   System.out.println("\t\t"+n+"*"+i+"="+(n*i)); 
    	    i=i+1;
    	   
      }//for
	}//else
	}//calc()
	
}//tableGen---BLC

class TableGenDemo {
	
	public static void main(String []args)
	{
		if(args.length!=1)
		{
			System.out.println("Pls enter one from CMD Prompt");
		}
		else 
		{   
			//int a=Integer.parseInt(x[0]);
			int y=Integer.parseInt(args[0]);
			TableGen tg=new TableGen();
			tg.accept(y);
			tg.calc();
		}//else
		
	}//main()
	

}//TableGenDemo
