package e.Polymorphism;

class BasicPhone {

	
	void message() {
		System.out.println("I am Basic");
	}
}

class SmartPhone extends BasicPhone {
	
	
//	void message1() { = if uncomment this, then you will get method  from parent class
					// so it is mistake that programmer has written 1 after message, so its message1
					// Intention was to override the method of parent class, so use annotation Override
//	@Override
	
	void message() {
		
//		super.message();
		
		System.out.println("I am Smart");
	}
}


public class cMethodOverriding {

public static void main(String[] args) {
	
	SmartPhone sp = new SmartPhone();
	sp.message();
	
	
 	
}	
	
	
	
}
