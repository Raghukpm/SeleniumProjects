
import java.util.Scanner;
class PaySlip
{
	String cname,cloc,top;
	Scanner s=new Scanner(System.in);
	void getCompanyDet()
	{
	  System.out.println("Enter Company NAme");
	  cname=s.nextLine();
	  System.out.println("Enter Company Location");
	  cloc=s.nextLine();
	  System.out.println("Type of Operations performing");
	  top=s.nextLine();
	}//getCompanyDet
	
	void dispCompDet()
	{
	 System.out.println("-----------------------------------");
	 System.out.println("Comapny Details");
	 System.out.println("Enter Company NAme:"+cname);
	 System.out.println("Enter Company Location :"+cloc);
	 System.out.println("Enter Company Location :"+top);
	  
}//dispCompDet()

}//PaySlip--TBC

class Employee extends PaySlip
{
	int eno;
	String ename,desig;
	double bsal,netsal;
	
void getEmpDet()
{
System.out.println("Enetr Emp Num :");
eno=Integer.parseInt(s.nextLine());
System.out.println("Enetr Emp Name :");
ename=s.nextLine();
System.out.println("Enetr Emp Designation:");
desig=s.nextLine();
System.out.println("Enetr Emp Bsalary:");
bsal=s.nextDouble();

}//getEmpDet

void dispPayslip()
{
getEmpDet();	
dispCompDet();
//calculate Employee benefits	
double da= 0.3* bsal;	
double ta= 0.2* bsal;
double cca=bsal*0.05;
double ma=bsal*0.03;
double hra=bsal*0.015;

//calculate emp deductions
double gpf= 0.3* bsal;
double lic=bsal*0.04;

//calculate Emp Net Salary
netsal=(bsal+da+ta+cca+ma+hra)-(gpf+lic);

//Display company details along with Payslip


System.out.println("================================");
System.out.println("Employee PaySlip:");
System.out.println("================================");
System.out.println("Emp NO:"+eno);
System.out.println("Employe  name"+ename);
System.out.println("Employe  Desigantion"+desig);
System.out.println("Emp Basic salary:"+bsal);
System.out.println("Emp Da\t\t:"+da);
System.out.println("Emp Ta\t\t:"+ta);
System.out.println("Emp CCA:"+cca);
System.out.println("Emp MA\t\t:"+ma);
System.out.println("Emp HRA\t\t:"+hra);
System.out.println("=================================");
System.out.println("Emp GPF\t\t:"+gpf);
System.out.println("Emp LIC\t\t:"+lic);
System.out.println("=================================");
System.out.println("Emp Net Salary :"+netsal);

}
	
}//Employee--IBC



public class PaySlipDemo {
	
	public static void main(String [] args)
	{
		Employee p=new Employee();
		p.getCompanyDet();
		p.dispPayslip();
		
	}//main

}//PaySlipDemo
