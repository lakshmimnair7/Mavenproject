package inheritance;

public class Child extends Parent 
{
		public void sub()
		{
			int sub = a-b;
			System.out.println("Difference is: "+ sub);
		}
		public static void main(String[] args) 
		{
			
			Child obj = new Child();
			obj.sub();
			obj.add();
		}

}
