package lesson3_4;

class Dog extends Pet {
	Dog() {
		this("無名");
	}

	Dog(String n) {
		super(n);
	}

	void bark() {
		System.out.println("ワンワン");
	}

	void action() {
		bark();
	}

	void sleep() {
		System.out.println("Z Z Z");
	}
}
