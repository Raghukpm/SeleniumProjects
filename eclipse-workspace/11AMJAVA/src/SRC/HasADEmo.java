package SRC;

import org.omg.Messaging.SyncScopeHelper;

class c1
{
	int a=10;
}

class c2
{
	int a=20;
}
class c3
{
	int a=30;
}

class c4
{
	c1 o1=new c1();//HAS-A RElation 
    c2 o2=new c2();//Has-A RElation 
    c3 o3=new c3();
    void add()
    {
    int d=o1.a+o2.a+o3.a;
    System.out.println("SUM of C1,c2,c3 IS "+d);
   }//add()
}

public class HasADEmo {
    public static void main(String [] k)
    {
       c4 o4=new c4();    
       o4.add();
    }//main()
	
}//HasADEmo
