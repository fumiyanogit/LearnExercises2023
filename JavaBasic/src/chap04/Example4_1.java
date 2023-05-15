package chap04;

class Bird{
	void fly(){
		System.out.println("鳥は飛びます");
	}
	void sing(){
		System.out.println("鳥は鳴きます");
	}
}

class  Swan extends Bird{
	void sing(){
		System.out.println("白鳥は鳴きます、ガーガー");
	}
	void ettou(){
		System.out.println("越冬のために日本へ渡ってきました");
	}
}
class Example4_1 {
	public static void main(String[] args) {
		Bird b = new Swan();
		b.fly();
		b.sing();
		//b.ettou(); これはエラー

		Swan s = (Swan)b;
		s.ettou();

	}
}
