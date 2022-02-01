package d.Inheritance;

class Car {
	String color;
	int numOfDoors;

	void drive() {
		System.out.println("Driving");
	}

	void pressBreak() {
		System.out.println("Pressing break");
	}
}

class SportsCar extends Car {
	void fly() {
		System.out.println("Flying");
	}
}

public class cEg3_Car {
	public static void main(String[] args) {
		Car c = new Car();
		SportsCar s = new SportsCar();
		s.drive();
	}
}
