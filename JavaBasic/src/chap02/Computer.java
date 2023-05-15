package chap02;

public class Computer {
	String model;
	int serialNumber;
	boolean power;

	void powerButton() {
		if(power) {
			System.out.println(model + "を起動しています");
		} else {
			System.out.println(model + "を停止します");

		}
		power = !power;
}
}

