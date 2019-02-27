//StudentData.java
package SRC;

import SRC.Student;
import java.util.*;

public class StudentData {
	
	public ArrayList readStdValues()
	{
		ArrayList al=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many Students U have ?");
		int nos=Integer.parseInt(s.nextLine());
		for(int i=0;i<nos;i++)
		{
			System.out.println("Enter"+(i+1)+"Student Details");
			System.out.println("------------------------------");
			System.out.println("Enter STd num");
			int sno=Integer.parseInt(s.nextLine());
			System.out.println("Enter std name");
			String name=s.nextLine();
			System.out.println("Enter marks");
			float marks=Float.parseFloat(s.nextLine());
			System.out.println("enter std college name :");
			String cname=s.nextLine();
			Student so=new Student(sno,name,marks,cname);
			al.add(so);//Adding student obj to 1D CFW obj
			System.out.println("------------------");
			
		}//for
		
		return al;
		
	}//ArrayList
	
	public void dispStudData(ArrayList al)
	{
		Object obj[]=al.toArray();
		System.out.println("Student details ");
		System.out.println("------------------");
		for(int i=0;i<obj.length;i++)
		{
			Student so=(Student) obj[i];//Object type casting
			so.disp();
		}
		System.out.println("----------------------");
	}//dispStudData

}//StudentData--BLC
