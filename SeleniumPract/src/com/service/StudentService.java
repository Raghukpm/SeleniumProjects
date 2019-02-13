package com.service;

import java.util.ArrayList;
import java.util.List;

import com.Student;

public class StudentService {

	public void validate(Student s) {
		if(s.getStudentMarks()>=70) {
			System.out.println(s);
		}else {
			System.out.println("student is failed in subj's");
		}
	}

	public List<Student> validateListOfStudentUsingMars(List<Student> listStudent) {
		// TODO Auto-generated method stu
		List<Student> resultStudent= new ArrayList<Student>();
		
		
		for (Student student : listStudent) {
			if(student.getStudentMarks()>=80) {
				resultStudent.add(student);
			}
		}
		
		return resultStudent;
	}

	public String validateListOfStudentUsingMarksString(List<Student> listStudent) {
		// TODO Auto-generated method stub
		String sname=null;
		
		for (Student student : listStudent) {
			if(student.getStudentId()==101) {
				 sname=student.getStudentName();
			}
		}
		
		
		return sname;
	}
	
}
