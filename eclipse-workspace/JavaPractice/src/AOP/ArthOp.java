package AOP;
//ArthOp.java
public class ArthOp {

    public void add(int x, int y)
    {
    	System.out.println("SUM ="+(x+y));
    }

    public void sub(int x, int y)
    {
    	System.out.println("Sub="+(x-y));
    }
    
    public void mul(int x, int y)
    {
    	System.out.println("MUl ="+(x*y));
    }
    public void div(int x, int y)
    {
    	System.out.println("Div ="+(x/y));
    }
    public void mod(int x, int y)
    {
    	System.out.println("mod ="+(x%y));
    }
    
}//ArthOp
