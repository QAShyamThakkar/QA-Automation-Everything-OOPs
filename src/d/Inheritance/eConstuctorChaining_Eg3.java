package d.Inheritance;

class Parent3 {

	Parent3() {

		System.out.println("I am defualt in parent");
	}

	Parent3(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child3 extends Parent3 {

	Child3() {

		System.out.println("I am defualt in child");

	}

	Child3(int a) {

		System.out.println("I am parameterized constructor in child");

	}

}

public class eConstuctorChaining_Eg3 {

	public static void main(String[] args) {

		Child3 c = new Child3(4);

	}

}
