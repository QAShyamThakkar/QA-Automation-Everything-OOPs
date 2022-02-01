package d.Inheritance;

class Parent1 {

	Parent1() {

		System.out.println("I am defualt in parent");
	}

	Parent1(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child1 extends Parent1 {

	Child1() {

//		super(); - Java will call this default constructor over here by super(); - so this statement is written by JAVA only!

		System.out.println("I am defualt in child");

	}

	Child1(int a) {

		System.out.println("I am parameterized constructor in child");

	}

}

public class eConstuctorChaining_Eg1 {

	public static void main(String[] args) {

		Child1 c = new Child1();

		// Contructor will be called - Parent - Default, Child - Default

	}

}
