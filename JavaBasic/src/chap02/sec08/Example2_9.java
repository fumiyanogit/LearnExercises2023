package chap02.sec08;

class Example2_9 {
	public static void main(String[] args) {

		Computer comp = ComputerFactory.create("F-04E", 7439012, true);

		ComputerFactory.repair(comp);

	}
}
