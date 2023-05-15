package lesson5_2;

class Owner {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("みけ");
		Cat c2 = new Cat();
		c2.setName("とら");
		Hospital h = new Hospital();
		h.care(c);
		h.care(c2);
		// 以下のコメントを外すとコンパイルエラーとなること
		// c.meow();
	}
}
