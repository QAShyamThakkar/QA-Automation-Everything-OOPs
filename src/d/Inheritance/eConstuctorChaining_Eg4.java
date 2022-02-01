package d.Inheritance;

class Parent4 {

	Parent4() {

		System.out.println("I am defualt in parent");
	}

	Parent4(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child4 extends Parent4 {

	Child4() {

		super();

	}

	Child4(int a) {

		System.out.println("I am parameterized constructor in child");

	}

}

public class eConstuctorChaining_Eg4 {

	public static void main(String[] args) {

		Child4 c = new Child4();

	}

}
