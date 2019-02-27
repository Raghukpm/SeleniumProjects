
import java.util.ArrayList;
import java.util.List;

public class DuplicateWordUsingList {
	
	public static void main(String args[]) {
		
		String str = "India is my is country is";
		
		String[] listArr = str.split(" ");
		List<String> list = new ArrayList<String>();
		//list.add(listArr[0]);
		for(int i=0;i<listArr.length;i++)
		{
			if(!list.contains(listArr[i])) {
				list.add(listArr[i]);
				
				System.out.print(listArr[i]+" ");
			}
		
		}
		
	}

}
