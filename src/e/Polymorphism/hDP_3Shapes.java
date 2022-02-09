package e.Polymorphism;

////////3/////////////////////////////////////////////////////
class Shape {

	void draw() {

		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class hDP_3Shapes {
	public static void main(String args[]) {
		Shape s;

		s = new Shape(); // Parent Class
		s.draw();

		s = new Rectangle(); // Child Class
		s.draw();

		s = new Circle();
		s.draw();

		s = new Triangle();
		s.draw();
	}
}