package petsys.pet;

public class Cat {
	private String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	void meow() {
		System.out.println("ニャーニャー");
	}
}
