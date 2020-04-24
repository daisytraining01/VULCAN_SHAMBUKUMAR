package com.picnic.question4;

public class ClassB extends ClassA {
	
	public ClassB(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		ClassB obj=new ClassB(10,5);
		//ClassA obj1=new ClassB(10,5);
		obj.setEmpId(5555);
		obj.setEmpName("John");
		System.out.println("Employee Id : "+obj.getEmpId());
		System.out.println("Employee Name : "+obj.getEmpName());
		
		obj.addition();
		obj.multiplication();
	}

}
/*Output : 
	Invoked Super class contructor 
	Employee Id : 5555
	Employee Name : John
	Addition : 15
	Multiplication : 50
*/