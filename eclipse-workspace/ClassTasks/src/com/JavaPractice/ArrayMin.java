package com.JavaPractice;
import java.util.Scanner;
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,min;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Array size :");
	n=s.nextInt();
	int a[]=new  int[n];
	System.out.println("Enter Array elements :");
	
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}//for1
	min=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}//if
		
	}//for2
		
	System.out.println("Min value in given array is :"+min);	
	}//main()

}//ArrayMin
