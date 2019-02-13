package com.main;

import java.util.ArrayList;
import java.util.List;

import com.Student;
import com.service.StudentService;

public class MainClass {

	public static void main(String []array) {
		
		List<Student> listStudent= new ArrayList<Student>();
		listStudent.add( new Student(101, "Govind", 95));
		listStudent.add( new Student(102, "Govind", 90));
		listStudent.add( new Student(103, "Govind", 80));
		listStudent.add( new Student(104, "Madhu", 60));
		listStudent.add( new Student(105, "Raghu", 55));
		listStudent.add( new Student(106, "Raju", 85));
		
		StudentService s= new StudentService();
		List<Student> resultListStudents=s.validateListOfStudentUsingMars(listStudent);
		String result=s.validateListOfStudentUsingMarksString(listStudent);
		System.out.println(result);

		System.out.println("inpit stdent list "+listStudent.size());
		
		System.out.println("output students "+resultListStudents.size());
		
		for (Student student : resultListStudents) {
	
			System.out.println(student);
			
		}
		
		
		
		
		
		/*Student s= new Student(101, "Govind", 90);
		Student s= new Student(101, "Govind", 70);
		Student s= new Student(101, "Govind", 75);
		Student s= new Student(101, "Govind", 34);
		Student s= new Student(101, "Govind", 24);
		*/
		
		
		
		
	
	}
	
}
