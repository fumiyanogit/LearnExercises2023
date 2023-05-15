package chap02.sec08;
;
class Computer {
	String model;
	int serialNumber;
	boolean	power;

	Computer(String str, int i, boolean b) {
		model = str;
		serialNumber = i;
		power = b;
	}

	void powerButton() {
		if (power) {
			System.out.println(model + "を起動しています");
		} else {
			System.out.println(model + "を停止しています");
		}
		power = !power;
	}
}
