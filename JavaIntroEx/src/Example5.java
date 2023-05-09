class Example5_1 {
	public static void main(String[] args) {
		int[] a;

		a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] は、" + a[i]);
		}


		String[] b = { "大吉 v（^o^）", "吉(^o^)", "凶(T_T))" };
		for (String str : b) {
			System.out.println(str);
		}
	}
}
