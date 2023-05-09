//class Exercise3_1 {
//	public static void main(String[] args) {
//		int a = 50;
//		int b = 9;
//		System.out.println("aは 50\t bは 9");
//		System.out.println("a,bの和は" + (a + b));
//		System.out.println("a,bの差は" + (a - b));
//		System.out.println("a,bの積は" + (a * b));
//		System.out.println("a,bの商は" + (a / b));
//		System.out.println("a,bの剰余は" + (a % b));
//		System.out.println("a,bを実数で計算すると商は" + (a / (double)b));
//	}
//}


//class Exercise3_2 {
//	public static void main(String[] args) {
//		int a = 50, b = 9;
//
//		System.out.println("aは 50\t bは 9");
//		System.out.println("aとbは同じ\t" + (a == b));
//		System.out.println("aはbと同じでない\t" + (a != b));
//		System.out.println("aはbより大きい\t" + (a > b));
//		System.out.println("aはb以上だ\t" + (a >= b));
//		System.out.println("aはbより小さい\t" + (a < b));
//		System.out.println("aはb以下だ\t" + (a <= b));
//	}
//}


//class Exercise3_2 {
//	public static void main(String[] args) {
//		int a = 50, b = 9;
//
//		System.out.println("aは 50\t bは 9");
//		System.out.println("aはbより大きく、"
//			+ "かつaは50より大きい\t" + (a > b && a > 50));
//		System.out.println("aはbと同じでなく、"
//			+ "かつaは50以上だ\t" + (a != b && a >= 50));
//		System.out.println("aはbより大きい、"
//			+ "またはbは20より小さい\t" + (a > b || b < 20));
//		System.out.println("aはbまたは10より小さい\t\t\t" + (a == b || a < 10));
//	}
//}


//class Exercise3_2 {
//	public static void main(String[] args) {
//		int a = 50, b = 9;
//
//		System.out.println("aは 50\t bは 9");
//		System.out.println("aは負の数だ\t\t" + (a < 0));
//		System.out.println("aは偶数だ\t\t\t" + (a % 2 == 0));
//		System.out.println("aはbの倍数だ\t\t" + (a % b == 0));
//		System.out.println("aをbで割ると5以上あまる\t" + (a % b >= 5));
//		System.out.println("aは奇数かまたは5の倍数だ\t" + (a % 2 != 0 || a % 5 == 0));
//	}
//}


class Exercise3_2 {
	public static void main(String[] args) {
		int a = 50;

		System.out.println(a++);
		System.out.println(a);
	}
}
