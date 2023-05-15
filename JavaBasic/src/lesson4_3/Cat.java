package lesson4_3;

class Cat extends Pet {
	Cat(String n) {
		super(n);
	}

	void meow() {
		System.out.println("ニャーニャー");
	}

	void action() {
		meow();
	}
}
