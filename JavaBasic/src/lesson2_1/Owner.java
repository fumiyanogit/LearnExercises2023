package lesson2_1;

class Owner {
	public static void main(String[] args) {
		Cat comp1 = new Cat();
		Cat comp2 = new Cat();

		comp1.setName("みけ");
		comp2.setName("とら");

		System.out.println("名前：" + comp1.getName());
		comp1.meow();
		System.out.println("名前：" + comp2.getName());
		comp2.meow();

	}
}
