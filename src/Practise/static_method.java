package Practise;

public class static_method {

	public static void main(String[] args) {
		m1();
		static_method ss = new static_method();
		ss.m2();
		ss.m3("Hindi");
		ss.m4("suhas", 29);
		ss.m4("nikhil ", 27);
		ss.m4("shital", 28);
		
		
	}
	public static void m1() {
		System.out.println("Mathematics");
	}
	public void m2() {
		System.out.println("English");
	}
	public void m3(String name) {
		System.out.println(name);
	}
	public static void m4() {
		System.out.println("Marathi");
		
	}
		public void m4(String name, int age) {
			System.out.println("My name is " +name);
			System.out.println("My age is " +age);
		}
	
}
