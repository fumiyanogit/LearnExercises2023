package lesson3_3;

class Cat extends Pet {
	Cat() {
		this("無名");
	}

	Cat(String n) {
		super(n);
	}

	void action() {
		System.out.println("ニャーニャー");
	}
}
