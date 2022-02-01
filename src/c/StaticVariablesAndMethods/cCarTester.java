package c.StaticVariablesAndMethods;

public class cCarTester {
	public static void main(String[] args) {

//1.
//		bCarClass c1 = new bCarClass();
//		System.out.println(c1.numOfCar);
//		
//		bCarClass c2 = new bCarClass();
//		System.out.println(c2.numOfCar);
		
//2. If we make int numOfCar as static
	
//		bCarClass c1 = new bCarClass();
//		System.out.println(c1.numOfCar);
//		
//		bCarClass c2 = new bCarClass();
//		System.out.println(c2.numOfCar);
		
	
//3. Changing position at Sr 2		

		
		bCarClass c1 = new bCarClass();
		bCarClass c2 = new bCarClass();

		System.out.println(c1.numOfCar); // we need to access class variable by classname.variable, 
		System.out.println(c2.numOfCar); // so at RUNTIME java will replace c1/c2 with bCarClass
	
//4.
		
//		public static void main(String[] args) {
//		
		String str = "Hello"; // under static main -->> so string is static or Non static == :-) its LOCAL - no public pvt static etc
		
//		}		
//		
		
	}

}
