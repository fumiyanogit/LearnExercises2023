//class Exercise4_1 {
//	public static void main(String[] args) {
//		int a = (int) (Math.random() * 1000);
//
//		System.out.println("aは、" + a);
//
//		if (a % 2 == 0) {
//			System.out.println("aは偶数です");
//		}
//
//		else {
//			System.out.println("aは奇数です");
//		}
//
//	}
//}


//class Exercise4_1 {
//	public static void main(String[] args) {
//		// aは'A', 'B', 'C', 'D', 'E'のいずれか
//		char a = (char) (Math.random() * 5 + 'A');
//
//		System.out.println("成績は、" + a);
//		switch(a) {
//		case 'A':
//			System.out.println("大変よくできました");
//			break;
//		case 'B':
//			System.out.println("よくできました");
//			break;
//		case 'C':
//			System.out.println("もう少しがんばりましょう");
//			break;
//		case 'D':
//			System.out.println("最初から全部復習してください");
//			break;
//		default:
//			System.out.println("入力値が誤っています");
//
//		}
//	}
//}
//
//
//class Exercise4_1 {
//	public static void main(String[] args) {
//		int a = (int) (Math.random() * 100 + 1);
//		int answer = 0;
//		System.out.println("aは、" + a);
//
//		for (int i = 1; i <= a; i ++) {
//			answer += i;
//		}
//
//		System.out.println("1から" + a + "までの合計は" + answer + "でした");
//	}
//}
//
//aaabbb
class Exercise4_1 {
	public static void main(String[] args) {
		System.out.println("九九表\n");
		System.out.println("       1   2   3   4   5   6   7   8   9");
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " ");
			for (int j = 1; j <= 9 ; j++) {
				System.out.print(i*j);
				System.out.println();
			}
			System.out.println();
		}
	}
}
