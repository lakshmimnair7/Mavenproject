package hierarchichal;

public class ClassA extends ParentA
 {
	public void methodB()
	   {
	      System.out.println("This is Class A");
	   }
	
public static void main(String[] args) 
{
	 ClassA obj = new ClassA();
	 obj.methodB();
	 obj.add();
}
}