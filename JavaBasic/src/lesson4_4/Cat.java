package lesson4_4;

class Cat extends Pet implements Actionable{
	Cat(String n) {
		super(n);
	}

	void meow() {
		System.out.println("ニャーニャー");
	}

	public void action() {
		meow();
	}
}
