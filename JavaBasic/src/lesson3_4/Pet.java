package lesson3_4;

class Pet {
	String name;

	Pet() {
	}

	Pet(String n) {
		name = n;
	}

	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}

	void action() {
		System.out.println("ペットのアクションです");
	}

	void sleep() {
		System.out.println("Z Z Z");
	}


}
