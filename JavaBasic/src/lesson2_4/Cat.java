package lesson2_4;

class Cat {
	String name;
	static String animalType = "ネコ科";

	Cat() {
		name = "無名";
	}


	Cat(String i){
		name = i;
	}

	void setName(String i) {
		name = i;
	}

	String getName() {
		return name;
	}

	void meow() {
		System.out.println("ニャーニャー");
		}
	}




