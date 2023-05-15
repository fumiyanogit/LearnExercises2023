package chap04.sec04;

abstract class Bird {
	String  name;

	Bird(String name){
		this.name = name;
	}

	abstract void sing();
}

class Uguisu extends Bird{
	Uguisu(String name){
		super(name);
	}

	void sing(){
		System.out.println (name + "は鳴きます、ホーホケキョ！");
	}
}

class Sparrow extends Bird{
	Sparrow(String name){
		super(name);
	}

	void sing(){
		System.out.println (name + "は鳴きます、チュンチュン！！");
	}
}

class Crow extends Bird{
	Crow(String name){
		super(name);
	}

	void sing(){
		System.out.println (name + "は鳴きます、カアカア！");
	}
}

class Example4_4 {
	public static void main(String[] args){
		Bird[] birds = new Bird[4];

		birds[0] = new Uguisu("ホーくん");
		birds[1] = new Uguisu("ケキョちゃん");
		birds[2] = new Sparrow("チプちゃん");
		birds[3] = new Crow("カン太郎");

		for(int i = 0; i < birds.length; i++){
			birds[i].sing();
		}
	}
}
