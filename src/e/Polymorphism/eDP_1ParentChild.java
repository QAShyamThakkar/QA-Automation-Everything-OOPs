package e.Polymorphism;

class parent {

	public void add1(int a, int b) {

		System.out.println("I am in Parent = " + (a + b));

	}

	public void sub(int a, int b) {

		System.out.println("I am in Parent = " + (a - b));

	}

}

class child extends parent {

	public void add(int a, int b) {

		System.out.println("I am in Child = " + a + b);

	}

	public void mult(int a, int b) {

		System.out.println("I am in Child = " + (a * b));

	}

}

public class eDP_1ParentChild {

	public static void main(String[] args) {
		parent p1 = new parent();
		child c1 = new child();

		parent p2 = new child();
//	child c2 = new parent();


//	p2.add(2, 4);

	}

}

//}

//Gyan

//https://www.javatpoint.com/dynamic-polymorphism-in-java#:~:text=Dynamic%20polymorphism%20is%20a%20process,polymorphism%20or%20dynamic%20method%20dispatch.&text=In%20this%20process%2C%20an%20overridden,reference%20variable%20of%20a%20superclass.
// https://www.javatpoint.com/runtime-polymorphism-in-java
// https://www.guru99.com/java-inheritance-polymorphism.html
