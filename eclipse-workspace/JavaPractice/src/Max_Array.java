
public class Max_Array {
	public static void main(String []args)
	{
		int input_Array[]=new int[] {10,20,30,35,45};
		
		int max = getMax(input_Array);
		System.out.println("-----------------------");
		System.out.println("Max value of an given Array Is:"+max);
		System.out.println("-----------------------");
		
		int min = getMin(input_Array);
		System.out.println("-----------------------");
		System.out.println("Min value of given Array Is:"+min);
		System.out.println("-----------------------");
		
	}//main()
	
	public static int getMax(int[] array)
	{
	 int Maxvalue=array[0];
	 for (int i=0;i<array.length;i++)
	 {
		 if(array[i] > Maxvalue)
		 {
			 Maxvalue = array[i];
		 }
	 }//for_getMax
	 return Maxvalue;
	}//getMax

	public static int getMin(int[] array1)
	{
	 int Minvalue=array1[0];
	 for (int i=0;i<array1.length;i++)
	 {
		 if(array1[i] < Minvalue)
		 {
			 Minvalue = array1[i];
		 }
	 }//for_getMin
	 return Minvalue;
	}//getMin

}//Max_array

