//package chap02;
//
//public class Example2_2 {
//	public static void main(String[] args) {
//		Computer comp1 = new Computer();
//		Computer comp2 = new Computer();
//
//		comp1.model = "F-04E";
//		comp1.serialNumber = 7439012;
//		comp1.power = true;
//
//		comp2.model = "G-02C";
//		comp2.serialNumber = 3821029;
//		comp2.power = false;
//
//		comp1.powerButton();
//		comp2.powerButton();
//	}
//}

package chap02;

public class Example2_2 {

	public static void main(String[] args) {

		String comp1_model;
		int comp1_serialNumber;
		boolean comp1_power;

		String comp2_model;
		int comp2_serialNumber;
		boolean comp2_power;

		comp1_model = "F-04E";
		comp1_serialNumber = 7439012;
		comp1_power = true;

		comp2_model = "G-02C";
		comp2_serialNumber = 3821029;
		comp2_power = false;

		comp1_power = powerButton(comp1_model, comp1_power);
		comp2_power = powerButton(comp2_model, comp2_power);

	}

	public static boolean powerButton(String model, boolean power) {

		if (power) {
			System.out.println(model + "を起動しています。");
		} else {
			System.out.println(model + "を停止します。");
		}
		return !power;

	}

}