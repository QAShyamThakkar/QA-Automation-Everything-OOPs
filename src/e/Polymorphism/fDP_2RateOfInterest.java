package e.Polymorphism;

// Runtime Polymorphism or Static Polymorphism 

///////////////////////////2///////////////////////////////////////////////////////////////////

class Bank {

	public double getRateOfInterest() {

// if we change method name as *****getRateOfInterest1*****, so it gives error 41, 44 ,47
//	So DP work on method overriding and for that, parent class should have the same method first and then we can override with child class method	

		return 8.8;

	}

}

class CityBank extends Bank {

	public double getRateOfInterest() {

		return 9.9;

	}

}

class HSBCBank extends Bank {

	public double getRateOfInterest() {

		return 11.11;

	}

}

public class fDP_2RateOfInterest {
	public static void main(String[] args) {

		Bank b;

		b = new Bank();
		System.out.println("Bank Rate of Interest = " + b.getRateOfInterest());

		b = new CityBank(); // Dynamic Polymorphism
		System.out.println("City Bank Rate of Interest = " + b.getRateOfInterest());

		b = new HSBCBank(); // Dynamic Polymorphism
		System.out.println("HSBC Bank Rate of Interest = " + b.getRateOfInterest());

	}
}

