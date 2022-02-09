package e.Polymorphism;

// Runtime Polymorphism or Static Polymorphism 

///////////////////////////2///////////////////////////////////////////////////////////////////

class Bank1 {

	double ROI = 8.8;

}

class CityBank1 extends Bank1 {

	double ROI = 9.9;

}

class HSBCBank1 extends Bank1 {

	double ROI = 11.11;

}

public class gDP_2RateOfInterest2 {
	public static void main(String[] args) {

		Bank1 b;

		b = new Bank1();
		System.out.println(b.ROI);
		
		b = new CityBank1(); // Dynamic Polymorphism
		System.out.println(b.ROI);
		
		b = new HSBCBank1(); // Dynamic Polymorphism
		System.out.println(b.ROI);
	}
}
