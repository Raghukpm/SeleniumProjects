class HelloCons
	{
	 String shape;
	 int size;
	 public HelloCons(){
	}
	 public HelloCons(String s, int n){
	        shape = s;
	        size = n;
	}
	 public HelloCons(int n){
	        size=n;
	}
	public void display()
	{
	        System.out.println("Shape="+shape+";\t"+"size="+size);
	}
	}
	class Hello
	{
	   public static void main(String a[]){
	        HelloCons ob=new HelloCons();
	        HelloCons ob2=new HelloCons("circle", 8);
	        ob.display();
	        ob2.display();
	}
	}


