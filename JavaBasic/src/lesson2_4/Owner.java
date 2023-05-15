package lesson2_4;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		System.out.println("名前：" + c.getName());
		System.out.println("種類：" + Cat.animalType);
		c.meow();
		Cat c2 = new Cat("とら");
		System.out.println("名前：" + c2.getName());
		System.out.println("種類：" + Cat.animalType);
		c2.meow();
	}
}
