package com.picnic.question4;

public class ClassA {
	private int empId;
	private String empName;
	int a;
	int b;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public ClassA(int a,int b) {
		System.out.println("Invoked Super class contructor ");
		this.a=a;
		this.b=b;
	}
	public void addition() {
		int sum=a+b;
		System.out.println("Addition : "+sum);

	}
	public void multiplication() {
		int sum=a*b;
		System.out.println("Multiplication : "+sum);

	}

}
