package d.Inheritance;

class Parent5 {

	Parent5() {

		System.out.println("I am defualt in parent");
	}

	Parent5(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child5 extends Parent5 {

	Child5() {

		System.out.println("I am defualt in child");

	}

	Child5(int a) {

		super(99);

	}

}

public class eConstuctorChaining_Eg5 {

	public static void main(String[] args) {

		Child5 c = new Child5(9);

	}

}
