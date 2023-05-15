package chap03.sec05;

class Person {
	String  name;

	Person(){
		this("名無し");
	}

	Person(String n){
		name = n;
	}

	void introduce(){
		System.out.println ("私の名前は、" + name + "です");
	}
}

class Employee extends Person{
	String company;

	Employee(String n, String c){
		super(n);
		company = c;
	}

	void introduce(){
		System.out.println ("私の名前は、" + name + "です");
		System.out.println ("私の会社は、" + company + "です");
	}
}

class Example3_5 {
	public static void main(String[] args){
		Employee emp = new Employee("山本　薫", "Java商会");
		emp.introduce();

//		Person p = new Person();
	}
}
