package lesson4_3;

class Dog extends Pet {
	Dog(String n) {
		super(n);
	}

	void bark() {
		System.out.println("ワンワン");
	}

	void action() {
		bark();
	}
}
