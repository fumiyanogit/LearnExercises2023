

public class Example2_5 {
	public static void main(String[] args) {
		sample("Hello");
		sample("Desk", "Chair");
		sample("Apple", "Orange", "Lemon");
		sample("Red", "Blue", "Green", "Yellow");
	}
	public static void sample(String ... values) {
		for (String value : values) {
			System.out.print(value + ", ");
		}
		System.out.println();
	}
}
