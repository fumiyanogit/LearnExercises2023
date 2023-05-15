package chap02;

public class Example2_1 {
	public static void main(String[] args) {
		Computer comp;

		comp = new Computer();

		comp.model = "F-04E";
		comp.serialNumber = 7439012;
		comp.power = true;

		comp.powerButton();
	}

}
