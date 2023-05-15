package lesson3_4;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		Dog d = new Dog();
		d.setName("しろ");
		System.out.println("名前：" + c.getName());
		c.sleep();
		System.out.println("名前：" + d.getName());
		d.sleep();
	}
}
