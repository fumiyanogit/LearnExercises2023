package chap03.sec02;

class Parent{
	void methP(){
		System.out.println("Parentのメソッドです");
	}
}

class Child extends Parent{
	void methC(){
		System.out.println("Childのメソッドです");
	}
}

class GrandChild extends Child{
	void methG(){
		System.out.println("GrandChildのメソッドです");
	}
}
class Example3_2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.methP();
		c.methC();

		GrandChild g = new GrandChild();
		g.methP();
		g.methC();
		g.methG();
	}

}
