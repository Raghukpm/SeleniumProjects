//StudDDemo.java
package SRC;
import SRC.StudentData;
import java.util.*;
public class StudDDemo {
	public static void main(String []args)
	{
		StudentData sdo=new StudentData();
		ArrayList al=sdo.readStdValues();
		sdo.dispStudData(al);
	}//main

}//StudDDemo
