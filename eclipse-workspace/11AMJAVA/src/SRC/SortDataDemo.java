package SRC;
import java.util.*;
import SRC.SortData;
public class SortDataDemo {

	public static void main(String[] args) {
		 
		SortData sd=new SortData();
		LinkedList ll=sd.readValues();
		sd.SortValues(ll);
		

	}

}
