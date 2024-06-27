package inheritance;

public class SuperKey2 extends SuperKey    
{
	
	public SuperKey2()
	{
		super(); 	//super keyword used here ,to invoke the parent class
		System.out.println("Sum");
		System.out.println(super.a);
		super.add();
	}

	public static void main(String[] args) 
	{
		
		SuperKey2 obj = new SuperKey2();
		
	}

}
