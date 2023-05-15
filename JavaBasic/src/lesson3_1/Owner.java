package lesson3_1;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.setName("みけ");
		d.setName("しろ");
		System.out.println("名前：" + c.getName());
		c.meow();
		System.out.println("名前：" + d.getName());
		d.bark();
	}
}
