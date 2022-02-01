package a.Basic_ClassObjects;

public class BankClass {

// Variable

	int accNumber;
	int balance;
	String name;

//Constructor

	BankClass() {

		accNumber = 1234;
		balance = 101;
		name = "Cool";

	};

	public BankClass(String nameFromUser) {
		name = nameFromUser;

	}

	public BankClass(String nameFromUser, int amount) {
		balance = amount;

	}

// Methods

	public void withdraw(int amount) {
		balance = balance - amount;

	}

	public void deposit(int amount) {
		balance = balance + amount;

	}

	public void showBalane() {
		System.out.println(balance);

	}

	public void showName() {
		System.out.println(name);

	}

}
