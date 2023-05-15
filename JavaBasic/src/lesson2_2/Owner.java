package lesson2_2;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		System.out.println("名前：" + c.getName());
		c.meow();
		Cat c2 = new Cat();
		System.out.println("名前：" + c2.getName());
		c2.meow();
	}
}
