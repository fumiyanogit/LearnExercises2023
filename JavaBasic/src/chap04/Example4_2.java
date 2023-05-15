package chap04;

class Parent {
}

class Child extends Parent{
}

class Example4_2 {
	public static void main(String[] args){
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c1 = new Child();

		String str = "Hello";
		int[] ary = {1, 2, 3};

		System.out.println("p1 instanceof Parent: " + (p1 instanceof Parent));
		System.out.println("p1 instanceof Child : " + (p1 instanceof Child));
		System.out.println("p1 instanceof Object: " + (p1 instanceof Object));
		System.out.println("p2 instanceof Parent: " + (p2 instanceof Parent));
		System.out.println("p2 instanceof Child : " + (p2 instanceof Child));
		System.out.println("p2 instanceof Object: " + (p2 instanceof Object));
		System.out.println("c1 instanceof Parent: " + (c1 instanceof Parent));
		System.out.println("c1 instanceof Child : " + (c1 instanceof Child));
		System.out.println("c1 instanceof Object: " + (c1 instanceof Object));
		// 継承関係がないとコンパイルエラー
//		System.out.println("c1 instanceof String: " + (c1 instanceof String));

		System.out.println("str instanceof String: " + (str instanceof String));
		System.out.println("str instanceof Object: " + (str instanceof Object));
		System.out.println("ary instanceof Object: " + (ary instanceof Object));
	}
}
