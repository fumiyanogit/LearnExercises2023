package chap02.sec07;

class Computer {
	static int serialNumber = 0;

	Computer() {
		serialNumber++;
	}

	static void displaySerialNumber(){
		System.out.println("Computer：" + serialNumber + "台");
	}
}
