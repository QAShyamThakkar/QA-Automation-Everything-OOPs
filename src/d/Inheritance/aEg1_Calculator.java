package d.Inheritance;

///////////////Class 1

class BasicCalculator { 							// Parent or Super Class

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}
}

///////////////Class 2
class AdvanceCalculator {							 
//class AdvanceCalculator extends BasicCalculator{  	// Child or Sub Class

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

}

///////////////Class 3
class VeryAdvanceCalculator {						
//class VeryAdvanceCalculator extends AdvanceCalculator {			// Multilevel inheritance
	
	public void mod(int a, int b) {
		System.out.println(a % b);
	}
}

///////////////Public Class having main method
public class aEg1_Calculator {

	public static void main(String[] args) {
		BasicCalculator basicCal = new BasicCalculator();
		AdvanceCalculator advCal = new AdvanceCalculator();
		VeryAdvanceCalculator vAdvCalc = new VeryAdvanceCalculator();

		basicCal.add(20, 10);
		advCal.multiply(5, 4);
		vAdvCalc.mod(5, 4);

//		advCal.add(20, 10);

//		advCal.add(20,10); ------>>>>> Explain this, Error So duplicate method in AdvCal Class

		// then explain 1. duplication is crime in digital world,
//		2. if someone has change something in BasicCal Class then the same will NOT be updated in AdvCal class
		// So we need *******extends******* keyword

	}

}
