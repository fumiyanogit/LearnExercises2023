package chap04.sec06;

interface Singable {
	void sing();
}

abstract class Bird implements Singable{
	String  name;

	Bird(String name){
		this.name = name;
	}

	void fly(){
		System.out.println (name + "は飛びます！");
	}
}

class Uguisu extends Bird{
	Uguisu(String name){
		super(name);
	}

	public void sing(){
		System.out.println (name + "は鳴きます、ホーホケキョ！");
	}
}

class Sparrow extends Bird{
	Sparrow(String name){
		super(name);
	}

	public void sing(){
		System.out.println (name + "は鳴きます、チュンチュン！！");
	}
}

class Person{
	String  name;

	Person(String name){
		this.name = name;
	}
}

class Singer extends Person implements Singable{
	Singer(String name){
		super(name);
	}

	public void sing(){
		System.out.println (name + "は歌う、ラララララ～！");
	}
}

class Example4_6 {
	public static void main(String[] args){
		Singable[] voices = new Singable[4];

		voices[0] = new Uguisu("ホーくん");
		voices[1] = new Uguisu("ケキョちゃん");
		voices[2] = new Sparrow("チプちゃん");
		voices[3] = new Singer("マリア");

		for(int i = 0; i < voices.length; i++){
			voices[i].sing();
		}
	}
}

