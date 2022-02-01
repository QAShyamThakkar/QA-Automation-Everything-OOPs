package c.StaticVariablesAndMethods;

public class aBasicConcepts {
	
	
	
//**************Types Of Variable*********
	
///////////////////////////////1.	local variable
	
//	A variable declared inside the body of the method is called local variable. 
//	You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
	
//	Eg. drive method
	
	void drive(){
		int maxSpeed = 180;
	}
	
	
//**** NOW Variable which are not local (i.e. not within any method) i.e. class level variable  - We need to Bifurcate into two type****************
//	instance variable(Object)
//	static variable
	
//	Eg. car class
	
	class Car{
		
		int doors =4;  //doors is class level varibale whereas maxSpeed above its Local variable
		
		public void main(String[] args) {
			
		}
	}
	
// Here we can Bifurcate int doors in to instance variable or static variable
	
	
	
///////////////////////////////2.	instance variable
	
//	A variable declared inside the class but outside the body of the method, is called an instance variable. 
//	It is not declared as static.
//	It is called an instance variable because its value is instance-specific and is not shared among instances.
	
	
	

/////////////////////////////////3.	static variable

//	=> It belongs to the class (it's class property) and not object
//	=> Java will create SINGLE copy of static variable at class level regardless of number of objects we're creating
//	=> We don't need to create object of the class to access the static variable. We can directly use ClassName.variableName
//	=> static variable can be used to refer to the common property or value for all objects 
	//	=>for example - company name of employees, college name of students etc
	
//	Eg
//
//	1. Car (color, speed, nofdoor - non static AND numberOfCarProduced - static)
//	2. Family members individual income - non static AND family income as a whole - static
//	3. Empl Salary, ID, DOB - non static AND Company - static




























	


}
