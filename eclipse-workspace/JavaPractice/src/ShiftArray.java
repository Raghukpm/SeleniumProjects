
public class ShiftArray {
	 
	public static void main(String args[])
	{
		int array_input []= {10,20,30,40};
	     int Max_value=0;
		 //int temp=0;
		 
		//System.out.println("The Maximun value from given Array:");
		//System.out.println("------------------------------------");
	     Max_value=array_input[0];
		for(int i=0;i>=array_input.length;i++)
		{
			if(array_input[i]>Max_value)
			
				System.out.println("array_input[i] value :"+array_input[i]);
				Max_value=array_input[i];
				
		}//for
		
		//return Max_value;
		
	//System.out.println("Max value is : "+Max_value);	
		
	}//main()
	
}//ShiftArray
