package SRC;
//LLDemo.java
import java.util.*;
public class LLDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		System.out.println("Content of ll"+ll);//[]
		System.out.println("Size of linkedlist-ll is"+ll.size());//0
		//add elements to ll-->1D CFW obj
		System.out.println("After adding elements into list");
		ll.add(10);
		ll.add(10.33);
		ll.add("Java");
		ll.add(true);
		ll.add(10);

		System.out.println("Content of ll="+ll);//[10,10.33,java,true,10]
		System.out.println("Size of ll="+ll.size());
		ll.add(ll.size(),100.87f);//adding element at last position
		System.out.println("Content of ll");
		System.out.println("---------------");
		Object obj[]=ll.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
			
		}//for
		System.out.println("-----------------");


	}//main

}//LLDemo
