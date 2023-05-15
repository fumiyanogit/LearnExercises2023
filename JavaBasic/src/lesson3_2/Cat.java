package lesson3_2;

class Cat extends Pet {

	Cat() {
		name = "無名";
	}

	Cat(String i){
		name = i;
	}

	void meow() {
		System.out.println("ニャーニャー");
	}
}
