package d.Inheritance;

//*******Uncomment line 24 and 30, it is loop - COMPILATION ERROR

class Parent6 {

	Parent6() {

		System.out.println("I am defualt in parent");
	}

	Parent6(int a) {

		System.out.println("I am parameterized constructor in parent");
	}

}

class Child6 extends Parent6 {

	Child6() {

//		this(90);

	}

	Child6(int a) {

//		this();

	}

}

public class eConstuctorChaining_Eg6 {

	public static void main(String[] args) {

		Child6 c = new Child6();

	}

}
