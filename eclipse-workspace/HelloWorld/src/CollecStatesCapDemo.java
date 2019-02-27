
import java.util.*;
	class StatesCaps
	{
		void OrgstatesCaps()
		{
			TreeMap tm=new TreeMap();
			//Add states and Caps
			tm.put("TS","HYD");
			tm.put("AP","VJA");
			tm.put("TN","CHE");
			tm.put("KA","BNG");
			tm.put("MH","MUM");
			tm.put("KL","KOCHI");
			
		System.out.println( "==========================================");	
		System.out.println( "==========================================");
		System.out.println( "\t\tStates \t\t\t Capitals\t\t");
		System.out.println( "==========================================");
		System.out.println( "==========================================");
		Set S=tm.keySet();
		Iterator itr=S.iterator();
		while (itr.hasNext())
		{
			Object state =itr.next();
			Object cap=tm.get(state);
			System.out.println("\t"+state+"\t\t"+cap);
		}
		System.out.println( "==========================================");
		System.out.println( "==========================================");
		Scanner s1=new Scanner(System.in);
		String st=null;
		do
		{
			System.out.println("Enter Your state");
			st=s1.nextLine();
		}
		while (st.isEmpty());
		
		Object cap=tm.get(st.toUpperCase().trim());
		
	//else
		{
			System.out.println(st+"Does not Exists");
		
		}
		
		
		}//OrgstatesCaps
	}//StatesCaps---BLC
	
	public class CollecStatesCapDemo 
	  {
		public static void main(String[]args)
		{
			StatesCaps Sc=new StatesCaps();
		    Sc.OrgstatesCaps();
		}
}//CollecStatesCapDemo
