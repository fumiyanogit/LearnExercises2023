package lesson4_1;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat("みけ");
		Dog d = new Dog("しろ");
		Hospital h = new Hospital();
		h.care(c);
		h.care(d);
		c.meow();
		d.bark();
	}
}
