package lesson2_2;

class Cat {
	String name;

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




