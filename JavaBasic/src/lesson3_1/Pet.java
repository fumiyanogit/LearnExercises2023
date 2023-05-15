package lesson3_1;

class Pet {
	String name;

	void setName(String i){
		name = i;
	}

	String getName() {
		return name;
	}

}

class Cat extends Pet {
	void meow() {
		System.out.println("ニャーニャー");
	}
}

class Dog extends Pet{
	void bark() {
		System.out.println("ワンワン");
	}
}