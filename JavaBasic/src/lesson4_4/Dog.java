package lesson4_4;

class Dog extends Pet implements Actionable{
	Dog(String n) {
		super(n);
	}

	void bark() {
		System.out.println("ワンワン");
	}

	public void action() {
		bark();
	}
}
