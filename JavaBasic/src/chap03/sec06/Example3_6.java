package chap03.sec06;

class Person {
	String  name;

	Person(){
		this("名無し");
	}

	Person(String name){
		this.name = name;
	}

	void introduce(){
		System.out.println ("私の名前は、" + name + "です");
	}
}

class Employee extends Person{
	String company;

	Employee(String name, String company){
		super(name);
		this.company = company;
	}

	void introduce(){
		super.introduce();
		System.out.println ("私の会社は、" + company + "です");
//		super.introduce();
	}
}

class Example3_6 {
	public static void main(String[] args){
		Employee emp = new Employee("山本　薫", "Java商会");
		emp.introduce();
	}
}
