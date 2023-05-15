package chap03.sec3;

class Person {                     
	String  name;

	void introduce(){
		System.out.println ("私の名前は、" + name + "です");
	}
}

class Employee extends Person{
	String company;
	
	Employee(String n, String c){
		name = n; 
		company = c;
	}
	
	void introduce(){
		System.out.println ("私の名前は、" + name + "です");
		System.out.println ("私の会社は、" + company + "です");
	}	
}

class Example3_3 {
	public static void main(String[] args){
		Employee emp = new Employee("山本　薫", "Java商会");
		emp.introduce();
	}
}
