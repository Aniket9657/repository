package com.Collection;

public class Women {
	String name;
	int age;
	String job;
	double sal;
	Women(){
	}
	public Women(String name, int age, String job, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Women [name=" + name + ", age=" + age + ", job=" + job + ", sal=" + sal + "]";
	}
	
	

}
