package lesson2_3;

class Cat{
	String name;

	Cat(String i){
		name = i;
	}

	String getName() {
		return name;
	}

	void meow() {
		System.out.println("ニャーニャー");
	}

	void meow(String msg) {
		System.out.println(msg);
	}

	void meow(String msg, int count) {
		for (int j = 1; j < count; j++) {
			System.out.println(msg);
		}
	}

}
