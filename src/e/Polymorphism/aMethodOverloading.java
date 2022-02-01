package e.Polymorphism;

//SAME CLASS
//If a class has multiple methods having the same name but different in parameters, it is known as Method Overloading.
//There are two ways to overload the method in java
//By changing the number of arguments
//By changing the data type

class Calculator {

	public void add(int a, int b) {

		System.out.println(a + b);

	}

	public void add(int a, int b, int c) {

		System.out.println(a + b);

	}

	public void add(double a, double b) {

		System.out.println(a + b);

	}
}

public class aMethodOverloading {
	public static void main(String[] args) {

		Calculator obj = new Calculator();
		obj.add(4, 5);
		obj.add(1.5, 2.5);
	}

}
