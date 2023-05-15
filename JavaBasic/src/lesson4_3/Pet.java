package lesson4_3;

abstract class Pet {
	String name;

	Pet(String n) {
		name = n;
	}

	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}

	abstract void action();
}
