package hierarchichal;

public class ClassB extends ParentA {    // extends keyword indicates that you are making a new class that derives from an existing class
	
	public void methodC()
	  {
	     System.out.println("This is Class B");
	  }

	public static void main(String[] args) 
	{
		
	     ClassB obj1 = new ClassB();
	     obj1.methodC();
	     obj1.add();
	     
	     
	   

	}

}
