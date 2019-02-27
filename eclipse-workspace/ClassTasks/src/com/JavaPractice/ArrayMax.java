package com.JavaPractice;

import java.util.Scanner;
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,max;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Array size :");
	n=s.nextInt();
	
	int a[] = new int[n];
	System.out.println("Enter elements to Array");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}//for1
	max=a[0];
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}//if
		
	}//for2
System.out.println("Maximum value is :"+max);
	
	}//Main()

}//ArrayMax
