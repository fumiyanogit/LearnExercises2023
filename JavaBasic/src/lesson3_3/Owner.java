package lesson3_3;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		Dog d = new Dog();
		d.setName("しろ");
		System.out.println("名前：" + c.getName());
		c.action();
		System.out.println("名前：" + d.getName());
		d.action();
	}
}
