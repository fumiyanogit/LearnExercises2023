package デフォルト;

import java.util.Scanner;

class Extra1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("文字列を入力してください");

		String str = sc.nextLine();

		System.out.println("入力された文字列は" + str + "です");
	}
}
