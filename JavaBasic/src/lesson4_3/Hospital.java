package lesson4_3;

class Hospital {
	void care(Pet p) {
		System.out.println(p.getName() + "を治療します。。。");
		p.action();
	}
}
