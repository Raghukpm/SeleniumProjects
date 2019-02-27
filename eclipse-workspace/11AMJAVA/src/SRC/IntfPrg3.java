package SRC;
//IntfPrg3.java
import java.util.Scanner;
interface Figure2
{
	void peri();
}//Figure
class Square2 implements Figure2
{
	public void peri()
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of Side");
    double sr=Double.parseDouble(s1.nextLine());
    double peri=4*sr;
    System.out.println("Peri meter of Square="+peri);
	}//peri()
}

public class IntfPrg3 {

public static void main(String[] args) {
	Figure2 fo=new Square2();
	fo.peri();
}
}
