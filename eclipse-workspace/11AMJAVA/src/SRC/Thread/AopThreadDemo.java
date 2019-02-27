package SRC.Thread;

import java.util.Scanner;

//Aop.java
class Sum extends Thread
{
	int a, b;
	void set(int a,int b )
	{
		this.a=a;
		this.b=b;	
	}
	public void run()
	{
		int c=a+b;
		System.out.println("Sum"+c);
	}//run()
}//sum
class Sub implements Runnable
{
int a,b;
void set(int a,int b)
{
	this.a=a;
	this.b=b;
	
}
 public void run()
 {
	 int c=a-b;
	 System.out.println("Sub"+c);
 }
}//sub

public class AopThreadDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values for AOP");
		int a=Integer.parseInt(s.nextLine());
		int b=Integer.parseInt(s.nextLine());
		
		//create Threads
		Sum so1=new Sum();
		System.out.println(so1.getState() + " and execution is "+so1.isAlive());
		so1.set(a, b);
		so1.start();
		System.out.println(so1.getState() + " and execution is "+so1.isAlive());
		Sub so2=new Sub();
		so2.set(a, b);
		
		Thread t=new Thread(so2);
		
		t.start();
	//Joining Threads 
   try {
	   so1.join();
	   t.join();
	   }catch(InterruptedException ite)
   {
		   System.out.println("Problem in Execution");
   }
   //Check the execution status and state name of completed threads 
   System.out.println(so1.getState() +" and execution is "+ so1.isAlive());
   System.out.println(t.getState() + "and execution is "+t.isAlive());
	}//main

}//AopThreadDemo
