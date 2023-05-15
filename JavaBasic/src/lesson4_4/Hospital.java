package lesson4_4;

class Hospital {
	void care(Actionable ac) {
		Pet p = (Pet) ac;
		System.out.println(p.getName() + "を治療します。。。");
		ac.action();
	}
}
