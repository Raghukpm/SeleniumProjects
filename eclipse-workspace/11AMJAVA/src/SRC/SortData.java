//SortData.java
package SRC;
import java.util.*;
public class SortData {
	public LinkedList readValues()
	{
		LinkedList ll=new LinkedList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers You have ");
		int n=Integer.parseInt(s.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"values :");
			int v=Integer.parseInt(s.nextLine());
			ll.add(v);
		
		}//for
		
		return ll;
	}//readValues
	public void SortValues(LinkedList x)
	{
		System.out.println("Original values :");
		System.out.println("----------");
		Object obj[]=x.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("\t"+obj[i]);
		}//for
		System.out.println("----------------------");
		Collections.sort(x);
		obj=x.toArray();
		System.out.println("Sorted values Ascending order");
		System.out.println("----------------------");
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("\t"+obj[i]);
		}
		System.out.println("---------------------");
		System.out.println("Sorted values Desending order :");
		System.out.println("------------------");
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println("\t"+obj[i]);
		}//for
		System.out.println("-------------------");
		System.out.println("Max element ="+Collections.max(x));
		System.out.println("Min element ="+Collections.min(x));
		
		System.out.println("-------------------");
	}//SortValues

}//SortData
