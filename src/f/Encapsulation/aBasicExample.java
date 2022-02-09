package f.Encapsulation;

//Two Parts

//1. Working - that is getter and setter
//     Auto Generate getter and setter - rightClick > Source > Generate

//2. Concept - We can have log

class Bank {

	private int bankAccNum;
	private String name;

	public int getBankAccNum() {

		System.out.println("User is accessing the value");
		return bankAccNum;
	}

	public void setBankAccNum(int bankAccNum) {

		this.bankAccNum = bankAccNum;
		System.out.println("BankAccNum is changed");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class aBasicExample {

	public static void main(String[] args) {

		Bank acc1 = new Bank();
		acc1.setBankAccNum(1234);
		System.out.println(acc1.getBankAccNum());

//		acc1.bankAccNum = 1223;  / if access like this, there is no control

	}

}
