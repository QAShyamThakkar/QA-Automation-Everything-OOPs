package e.Polymorphism;

// SAME CLASS
//If a class has multiple methods having the same name but different in parameters, it is known as Method Overloading.

//There are two ways to overload the method in java
//By changing the number of arguments
//By changing the data type
class Calc {

	int num1;

	int num2;

	String operation;

	Calc() {

		System.out.println("Do Nothing");

	}

	Calc(int i) {

		System.out.println("Num1 as per user is " + i);

	}

	Calc(int i, int j) {

		System.out.println("Num1 as per user is " + i);

		System.out.println("Num2 as per user is " + j);

	}

	Calc(int i, int j, String op) {

		System.out.println("Num1 as per user is " + i);

		System.out.println("Num2 as per user is " + j);

		System.out.println("And perform operation " + "Add");

	}

}

public class bConstructorOverloading {

	public static void main(String[] args) {

		Calc obj = new Calc(9, 4, "+");

	}

}
