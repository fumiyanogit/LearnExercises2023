package lesson5_1;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("みけ");
		System.out.println("名前：" + c.getName());
		c.meow();
		Cat c2 = new Cat();
		c2.setName("とら");
		System.out.println("名前：" + c2.getName());
		c2.meow();
	}
}
