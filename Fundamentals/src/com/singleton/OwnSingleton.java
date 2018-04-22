package com.singleton;

public class OwnSingleton extends A{

	//For this we have to use Private Constructor, private static var and public factory method
	private static OwnSingleton o = new OwnSingleton();					//1. Creating Object first, because modifier is static 
	
	public static OwnSingleton getOwnSingleton() {
		return o;
	}
	static int a=10;													//5. Static variable initialization

	public static int m1() {
		System.out.println("m1");
		return a;
	}
	public void m2(int a) {
		if(a==this.a) {
			System.out.println("matches "+a);
		}else {
			System.out.println("Not matched "+a+" is Param and "+this.a+" is instance var value");
		}
	}
	static {															//6. Static block exec from top to bottom
		System.out.println("Class OwnSingleton "+o);											//7. Object has been created so, Address will print
		System.out.println("Static");
	}
	{																	//2. Instance blocks will invoke because Object is getting created
		System.out.println("Class OwnSingleton "+o);											//3. Object creation not yet completed so, Still object will have null
		System.out.println("Instance");
	}
	private OwnSingleton() {											//4. After executing of Constructor Object creation will be completed
		System.out.println("Cons");
	}
	
	
	public static void main(String[] args) {							//8. Flow comes here
		System.out.println("ew");
		OwnSingleton o1 = OwnSingleton.getOwnSingleton();				
		System.out.println(o1);											//9. Still o1 will print same Object address, because we are not creating Object again, Just using it
		OwnSingleton o2 = OwnSingleton.getOwnSingleton();
		System.out.println(o2);	
		o2.m2(o1.m1());													//10. Matches10
		o2.m2(11);														//11. Not matched 11 is param and 10 is instance var value

	}

}
class A{
	static OwnSingleton o = OwnSingleton.getOwnSingleton();
	public static void main(String []args) {
		System.out.println("Class A "+o);
	}
}