package chap03.sec4;

class Parent {
	Parent(){
		System.out.println ("Parentコンストラクタ");
	}
}

class Child extends Parent {
	Child(){
		System.out.println ("Childコンストラクタ");
	}
}

class GrandChild extends Child{
	GrandChild(){
		new Child();
		System.out.println ("GrandChildコンストラクタ");
	}
}

class Example3_4 {
	public static void main(String[] args){
		GrandChild obj = new GrandChild();
	}
}

