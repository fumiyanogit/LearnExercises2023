package lesson2_3;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		System.out.println("名前：" + c.getName());
		c.meow();
		c.meow("ガウ");
		c.meow("ブヒ", 3);
	}
}
