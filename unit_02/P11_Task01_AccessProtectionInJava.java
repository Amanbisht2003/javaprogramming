package unit_02;

public class P11_Task01_AccessProtectionInJava {
		
		public int a = 10;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ChildClass obj = new ChildClass();
			
			obj.showdata();
			
			obj.accessData();

		}


}

class ParentClass {

	int a = 10; //default protection!
	public int b = 20; // can be accessed outside unit_02 package but within same project
	protected int c = 30; //can only be accessed within unit 02 package
	private int d = 40; //within parentclass only, not even in its sub-class

	void showdata() {
		System.out.println("inside parentclass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}

class ChildClass extends ParentClass {
	
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		// System.out.println("d= " + d); // private member can't be accessed
	}

}

class AnotherClass{
	void display() {
		ParentClass obj = new ParentClass();
		System.out.println (obj.a);
		System.out.println (obj.b);
		System.out.println(obj.c);
	}
}