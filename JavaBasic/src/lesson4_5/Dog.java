package lesson4_5;

class Dog extends Pet implements Actionable {
	Dog(String n) {
		super(n);
	}

	void bark() {
		System.out.println("ワンワン");
	}

	public void action() {
		bark();
	}

	public void sleep() {
		System.out.println("ZZZ");
	}
}
