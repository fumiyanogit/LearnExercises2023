package sec04;

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
			System.out.println(model + "を停止します");
		}
		power = !power;
	}

	void powerButton(boolean b) {
		if (b) {
			System.out.println(model + "を強制的に起動しています");
		} else {
			System.out.println(model + "を強制的に停止します");
		}
	}
}

