import java.util.*;
public class TypeCast 
 {
  public static void main (String [] args)
  {
	  Object obj="raghu";
	  System.out.println(obj.getClass());
	  System.out.println("value of obj="+obj);
	  String s=(String)obj;
	  int noc=s.length();
	  System.out.println(obj+   "contains"  +noc );
	  
	  }
  }
