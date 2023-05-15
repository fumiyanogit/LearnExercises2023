package chap02.sec10;

class Example2_10 {
	public static void main(String[] args) {

		Computer comp = new Computer("F-04E", 7439012, true);

		Mouse mouse = new Mouse("M-01");

		comp.setMouse(mouse);

		System.out.println(comp.getMouse().getModel());

	}
}
