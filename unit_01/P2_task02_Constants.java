package unit_01;
//piece of data that never change 
//constants do not change their value
//
//private: inside class only
//public:class + within the package + outside the package
//protected :class +same package
//default : no keyword ,package-private{ not outside package}

public class P2_task02_Constants {
	private static final double Pi= 3.14;
	public static void main(String[] args)
	{
	
	
		//final keyword in use to make a variable constant
		final int a=10;
		System.out.println(a);
		System.out.println(Pi);
		hello();
		abc obj= new abc();
		int c=obj.add(2,3);
		System.out.println(c);
	}
	//hello function is called inside static main func so we need to make below function static too
	static void hello()
	{
		System.out.println("hello !world ");
	}
	
	
			
//class name should be static to avoid multiple class instance problem
	static class abc
	{
		int add(int a,int b)
		{
			return (a+b);
		}
	}
	
	
}