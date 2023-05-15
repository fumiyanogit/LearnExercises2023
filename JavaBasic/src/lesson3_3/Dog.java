package lesson3_3;

class Dog extends Pet {
	Dog() {
		this("無名");
	}

	Dog(String n) {
		super(n);
	}

	void action() {
		System.out.println("ワンワン");
	}
}
