//EmpExcep
package com;
import com.NegSalExcep;
import com.PosSalExcep;
public class EmpExcep {
   
	public void decide(String esal) throws NegSalExcep,PosSalExcep,NumberFormatException
	{
		int sal=Integer.parseInt(esal);
		if (sal<0)
		{
			NegSalExcep no=new NegSalExcep("Invalid Salary");
			throw no;
		}//if
		else
		{
			PosSalExcep po=new PosSalExcep("Valid Salary");
			throw po;
			
		}//else
		
	}//decide
	
}//EmpExcep-->Prog defined common class
