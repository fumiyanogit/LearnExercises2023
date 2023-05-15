package sec04;

class Example2_4 {
	public static void main(String[] args){
		Computer comp = new Computer("F-04E", 7439012, true);
 		comp.powerButton();
		comp.powerButton(false);
	}
}

