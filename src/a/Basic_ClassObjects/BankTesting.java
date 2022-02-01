package a.Basic_ClassObjects;

public class BankTesting {
	public static void main(String[] args) {

		BankClass acc1 = new BankClass("Shyam");
//		acc1.showBalane();

		acc1.name = "Shyam";
		acc1.balance = 100;

		acc1.deposit(100);
		acc1.showBalane();

//******************************************************

		BankClass acc2 = new BankClass("Shyam");

		acc2.showBalane();
		acc2.showName();

//		System.out.println(acc2.balance);

	}

}


