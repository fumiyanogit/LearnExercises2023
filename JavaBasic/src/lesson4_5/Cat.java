package lesson4_5;

class Cat extends Pet implements Actionable {
	Cat(String n) {
		super(n);
	}

	void meow() {
		System.out.println("ニャーニャー");
	}

	public void action() {
		meow();
	}

	public void sleep() {
		System.out.println("zzz");
	}
}
