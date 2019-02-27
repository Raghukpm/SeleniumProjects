package SRC.Thread;

import java.util.Scanner;

class CharGen implements Runnable
{
	  CharGen() {
	System.out.println("CharGen Default constructors");
	Thread t=new Thread(this);
	t.start();
		  
	}

	public void run() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter line of text :");
		String text=s.nextLine();
		System.out.println("Given text is "+text);
		System.out.println("=====================");
		try {
			for(int i=0;i<text.length();i++)
			{
				char ch=text.charAt(i);
				System.out.print(" "+ch);
				Thread.sleep(500);
			}//for
		}catch(InterruptedException ie) {
			System.out.println("Prod in Thread Execution"+ie.getMessage());
		}
	}
}//CharGen--BLC


public class CharGenDemo {

	public static void main(String[] args) {
          System.out.println("Iam from main ()");
          
          CharGen co=new CharGen();
          
		
	}//main()

}//CharGenDemo
