package chap02.sec08;

class ComputerFactory {

	static Computer create(String str, int i, boolean b) {
		Computer comp = new Computer(str, i, b);
		System.out.println(comp.model + "を製造しました。");
		return comp;
	}

	static void repair(Computer comp) {
		System.out.println(comp.model + "の修理をしました。");
	}
	
}
