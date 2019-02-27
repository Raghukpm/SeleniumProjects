
public class Multidemo{
	
	public static void main(String args[])
	{
		int ar1[]= {1,2,3,4};
		int newArray[]= ShiftMultiple(ar1);
		printArray(newArray);
		
	}//main
	
	public static int[] ShiftMultiple(int[]arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-2;i>-1;i--)
		{
          arr[i+1]=arr[i];
        }
     arr[0]=temp;
     return arr;
	}
	
	public static void printArray(int[] arr1)
	{
		for(int x[]  arr1)
			System.out.println(x + + ",");
	}
		
	}//Multidemo	
		