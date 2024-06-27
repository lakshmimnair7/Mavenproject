package inheritance;

public class ChildC extends ChildB
{
	public void display3()
	{
	System.out.println("Name of child is Kunju");	
	}

	public static void main(String[] args) 
	{
		ChildC obj = new ChildC();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}
	

}
