package lesson3_2;

class Dog extends Pet {

	Dog(){
		name = "無名";
	}

	Dog (String i){
		name = i;
	}

	void bark() {
		System.out.println("ワンワン");
	}
}
