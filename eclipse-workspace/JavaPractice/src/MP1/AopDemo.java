package MP1;
import java.util.Scanner;
import AOP.ArthOp;
import MP1.MenuOp;

public class AopDemo {
	
	public static void main(String[] args) {
		String choice=null;
		Scanner s=new Scanner(System.in);
		ArthOp ao=new ArthOp();
		MenuOp mo=new MenuOp();
		do
		{	
		mo.MenuDetails();
		System.out.println("Enter your choice");
		int ch=Integer.parseInt(s.nextLine());
		switch(ch)
		{ 
		case 1:ao.add(12,10);  break;
		case 2:ao.sub(4,120);  break;
		case 3:ao.mul(12,10);  break;
		case 4:ao.div(43,10);  break;
		case 5:ao.mod(12,10);  break;
		default : System.out.println("Invalid selection ");
		}//switch
		System.out.println("DO u want continue(Y/N)..?");
		choice=s.nextLine();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println("Thankssss...!");
		
		
	}//main()
	

}//AopDemo
