package e.Polymorphism;



////////1////////////////////////////////////////////////////////////////////////////////////////

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

//	
//	p2.add(2, 4);

	}
}

//Gyan

//https://www.javatpoint.com/dynamic-polymorphism-in-java#:~:text=Dynamic%20polymorphism%20is%20a%20process,polymorphism%20or%20dynamic%20method%20dispatch.&text=In%20this%20process%2C%20an%20overridden,reference%20variable%20of%20a%20superclass.
// https://www.javatpoint.com/runtime-polymorphism-in-java
// https://www.guru99.com/java-inheritance-polymorphism.html

//Method Overloading is known as Static Polymorphism and also Known as Compile Time Polymorphism or Static Binding because overloaded method calls get resolved at compile time by the compiler on the basis of the argument list and the reference on which we are calling the method.

//And Method Overriding is known as Dynamic Polymorphism or simple Polymorphism or Runtime Method Dispatch or Dynamic Binding because overridden method call get resolved at runtime.

////Method overloading would be an example of static polymorphism
//
//whereas overriding would be an example of dynamic polymorphism.
//
//Because, in case of overloading, at compile time the compiler knows which method to link to the call. However, it is determined at runtime for dynamic polymorphism
