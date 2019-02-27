package SRC;

public class Student {
	
	int stno;
	String name,cname;
	float marks;
	
	public Student(int stno,String name,float marks,String cname) 
	{
		this.stno=stno;
		this.name=name;
		this.marks=marks;
		this.cname=cname;
	}//constructor
	public void disp()
	{
		System.out.println(stno+" "+name+" "+marks+" "+cname);
	}

}//Student--BLC
