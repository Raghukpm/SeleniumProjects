import java.util.HashMap;

public class WordCount {
	
	public static void main(String args[]) {

		String[] array = {"ab","bc","ab","cd","de","ab","ab","bc"};
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		for(int i=0;i<array.length;i++) {
			if(!map.containsKey(array[i])) {
				map.put(array[i], 1);
			}
			else
			{
				//int temp = map.get(array[i]);
				map.put(array[i], map.get(array[i])+1);
				
			
			}
		}
		System.out.println(map);
}
}
