package petsys.pet;

public class Hospital {
	public void care(Cat cat) {
		System.out.println(cat.getName() + "を治療します。。。");
		cat.meow();
	}
}
