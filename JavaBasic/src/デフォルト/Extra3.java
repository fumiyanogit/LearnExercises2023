package デフォルト;

import java.util.Scanner;

class Extra3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		do {
			System.out.print("正の整数＞");
			i = sc.nextInt();
		} while (i <= 0);

		System.out.println("入力した整数は" + i +"です。");

	}
}
