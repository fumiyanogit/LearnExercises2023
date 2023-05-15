package lesson3_4;

class Cat extends Pet {
	Cat() {
		this("無名");
	}

	Cat(String n) {
		super(n);
	}

	void meow() {
		System.out.println("ニャーニャー");
	}

	void action() {
		meow();
	}

	void sleep() {
		System.out.println("Z Z Z");
	}
}
