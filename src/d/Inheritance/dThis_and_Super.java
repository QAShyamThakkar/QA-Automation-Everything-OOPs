package d.Inheritance;

class Parent {

	int a = 10;

}

class Child extends Parent {

	int a = 30;

	void method() {

		int a = 50;

		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);

	}

}

public class dThis_and_Super {

	public static void main(String[] args) {

		Child c = new Child();

		c.method();

	}

}
