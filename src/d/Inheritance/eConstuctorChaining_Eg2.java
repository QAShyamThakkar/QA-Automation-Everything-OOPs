package d.Inheritance;

class Parent2 {

	Parent2() {

		System.out.println("I am defualt in parent");
	}

	Parent2(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child2 extends Parent2 {

	Child2() {

		this(90);

	}

	Child2(int a) {

		System.out.println("I am parameterized constructor in child");

	}

}

public class eConstuctorChaining_Eg2 {

	public static void main(String[] args) {

		Child2 c = new Child2();


	}

}
