package com.practice.Inheritance;


// Over loading means will load the referenced method. Over riding means will replace the method of Run time Obj(new Obj())
public class MethodOverloading {
	public void m1(int a) {
		System.out.println(a);
	}									//1. This is called method overloading
	public void m1(String a) {
		System.out.println(a);
	}
	
	///////////2
	public void m2(Object a) {
		System.out.println(a);
	}
	public void m2(String a) {
		System.out.println(a);
	}
	
	////////3
	public void m3(String a) {
		System.out.println(a);
	}
	public void m3(StringBuffer a) {
		System.out.println(a);
	}
	
	////////4
	public void m4(int a) {
		System.out.println("General Arg");
	}
	public void m4(int... a) {
		System.out.println("Var-arg");
	}
	
	public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	obj.m1(10);
	obj.m1("Hello");

	////////2
	obj.m2("Hi");
	obj.m2(new Object());
	obj.m2(null);				//It will go to m2(String)
	
	///////3
	obj.m3("Hello");
	obj.m3(new StringBuffer("hgfg"));
	//obj.m3(null);				//This is ambiguous
	
	////////4
	obj.m4(10);					//General arg gng to call
	
	
	//////5
	Test t = new Test();
	AxisOver a = new AxisOver();
	t.m1(a);					//AxisOver version
	BankOver b = new BankOver();
	t.m1(b);					//BankOver version
	
	AxisOver ab = new BankOver();
	t.m1(ab);					//AxisOver version only for method overloading--for overriding ops
	}

}


///////5
class AxisOver{
	
}

class BankOver extends AxisOver{
	
}

class Test{
	public void m1(AxisOver a) {
		System.out.println("AxisOver version");
	}
	public void m1(BankOver a) {
		System.out.println("BankOver version");
	}
}