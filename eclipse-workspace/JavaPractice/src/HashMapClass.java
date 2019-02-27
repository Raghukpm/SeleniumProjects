import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {
	
	public static void main(String [] args)
	{
		//@SuppressWarnings("unchecked")
		HashMap<String,Integer> map = new HashMap<>();
		//Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		
		map.put("naveen",10);
		map.put("sai", 20);
		map.put("naveen", 10);
		System.out.println(map);
		
	}//main

}//HashMap