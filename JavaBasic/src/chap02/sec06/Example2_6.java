package chap02.sec06;

class Example2_6 {
	public static void main(String[] args) {
		System.out.println("家族共通の財布の残高：" + Wallet.familyBalance + "円");

		Wallet taro = new Wallet();
		Wallet hanako = new Wallet();

		System.out.println("taroの財布の残高    ：" + taro.balance + "円");
		System.out.println("hanakoの財布の残高  ：" + hanako.balance + "円");

		taro.balance -= 1000;
		hanako.balance -= 2000;

		hanako.familyBalance -= 3000;

		System.out.println();
		System.out.println("家族共通の財布の残高："	+ Wallet.familyBalance + "円");
		System.out.println("taroの財布の残高    ：" + taro.balance + "円");
		System.out.println("hanakoの財布の残高  ：" + hanako.balance + "円");

	}
}
