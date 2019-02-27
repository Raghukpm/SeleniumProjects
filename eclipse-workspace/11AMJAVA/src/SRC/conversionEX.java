package SRC;
//conversionEX.java
class conversionEX {
	
	public static void main(String []r)
	{
		String s="true";
		boolean b1=Boolean.parseBoolean(s);
		System.out.println("value of boolean"+b1);//true
		System.out.println("---------------------");
		String x[]= {"10","20"};
		System.out.println("concat sum="+x[0]+x[1]);//1020
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		int c=a+b;
		System.out.println("Sum"+c);//30
		System.out.println("sum="+a+b);//1020
		System.out.println("sum="+(a+b));//30
		System.out.println("mul="+a*b);//200
		//System.out.println("sub"+a-b);error
		System.out.println("sub"+(a-b));//-10
		System.out.println("div"+a/b);//0
		System.out.println("modules"+a%b);//10
	
	}//main()
	

}//conversionEX-ELC
